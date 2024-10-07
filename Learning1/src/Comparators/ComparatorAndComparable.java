package Comparators;
import java.util.*;

class Student implements Comparable<Student>{

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.marks = marks;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return marks == student.marks && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, marks);
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.marks,that.marks);
    }
}

public class ComparatorAndComparable {
    public static void main(String[] args) {

        // Comparator

        List<Integer> list= Arrays.asList(11,2,31,4,1);
        // Ternary logic for descending order sorting and we have to handle i == j
        //Comparator<Integer> cm = (i, j) -> i > j ? 1 : i < j ? -1 : 0;
        Comparator<Integer> cm = (i, j) -> Integer.compare(j, i); // Descending order better practice
        list.sort(cm);
        System.out.println(list);

        List<String> list2=Arrays.asList("Swapnil","Rishav","Harry","Hrishi","Riv");
        Comparator<String> c1=(i,j) -> Integer.compare(j.length(),i.length());
        list2.sort(c1);
        System.out.println(list2);

        // Comparable
        List<Student> list3 = new ArrayList<>();
        list3.add(new Student("Swapnil",99));
        list3.add(new Student("Rishabh",109));
        list3.add(new Student("Rishav",106));
        Collections.sort(list3);
        for(Student s1:list3) System.out.println(s1.getName()+": "+s1.getMarks());
    }
}
