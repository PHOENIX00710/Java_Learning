package org.example;
import java.sql.*;              // Import

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/College";
        String userName = "postgres";
        String passWord = "Timestone@007";
        String sqlQuery="";

        Connection con;
        Statement statement;
        PreparedStatement preparedStatement;

        // update
        try{
            con=DriverManager.getConnection(url,userName,passWord);
            sqlQuery="update student set marks = 99 where name='Rishabh'";

            statement= con.createStatement();
            statement.execute(sqlQuery);

            System.out.println("Entry Updated Properly");

            con.close();
        }
        catch (SQLException e){
            System.out.println("Issue with SQL connection "+e.getMessage());
        }

        //Inserting
       /* try {

            con = DriverManager.getConnection(url,userName,passWord);
            sqlQuery = "insert into student values (?,?,?)";

            preparedStatement = con.prepareStatement(sqlQuery);
            preparedStatement.setString(1,"Woodwinds005");
            preparedStatement.setInt(2,8);
            preparedStatement.setInt(3,0);

            preparedStatement.execute();

            con.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }   */

        // Retrieving all the required data
        try {

            con = DriverManager.getConnection(url,userName,passWord);
            sqlQuery = "select * from student";

            statement=con.createStatement();
            ResultSet resultSet=statement.executeQuery(sqlQuery);


            while(resultSet.next()){

                // There are methods to retrieve metadata which gives us info like number of columns and type of data
                ResultSetMetaData rsmd = resultSet.getMetaData();
                int colSize = rsmd.getColumnCount();
                for(int i=1;i<=colSize;i++){
                    String colName = rsmd.getColumnName(i);
                    int colTypeInt = rsmd.getColumnType(i);

                    switch (colTypeInt){
                        case 12:
                            System.out.print(colName+" : "+resultSet.getString(colName)+"; ");
                            break;
                        case 4:
                            System.out.print(colName+" : "+resultSet.getInt(colName)+"; ");
                            break;
                    }
                }
                System.out.println();
            }

            con.close();
        }
        catch (SQLException e) {
            System.out.println("Issue with SQL connection "+e.getMessage());
        }

    }
}