import java.util.LinkedList;
import java.util.Objects;

class Laptop{
    private int serialNumber;
    private String name;

    @Override
    public String toString() {
        return "Laptop{" +
                "serialNumber=" + serialNumber +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return serialNumber == laptop.serialNumber && Objects.equals(name, laptop.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, name);
    }
}

public class LibraryImplLL {
    public static void main(String[] args) {
        LinkedList<Integer> l1= new LinkedList<>();
        l1.add(2);
        l1.addFirst(3);
        l1.add(5);
        System.out.println(l1);
        for(Integer val:l1){
            System.out.print(val);
        }
        System.out.println();
        l1.remove(1);
        System.out.println(l1);
    }
}
