package CallByRef;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class MethodReference {
    public static void main(String[] args) {

        // Method or constructor references work best on streams of data
        List<String> names = Arrays.asList("Harry","Swapnil","Rishav","Ray");
        List<String> updatedNames = names
                                    .stream()
                                    .map(String::toUpperCase)
                                    .toList();
        for(String s:updatedNames) System.out.println(s);

        // Constructor Referencing
        List<Student> students = new ArrayList<>();
        students = names
                .stream()
                .map(Student::new)
                .toList();

        for(Student s:students) System.out.println(s.getName());
    }
}
