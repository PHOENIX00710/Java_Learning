package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        // Conversion to Integer
        List<Integer> l1 = Arrays.asList(12,1,3,4,2,5);
        Stream<Integer> s1 = l1.stream();

        // Use of Functional Interface Predicate for filter
        Predicate<Integer> p1 = (i) -> i%2==0;
        Stream<Integer> s2=s1.filter(p1);

        // Use of Functional Interface Consumer for foreach
        Consumer<Integer> c1 = (i) -> System.out.println(i*2);
        s2.forEach(c1);

        // Chaining of Methods
        List<Integer> l2 = Arrays.asList(99,2,3,5,6,7,8,22,10);
        int ans = l2.stream()
                .filter(i -> i%2 != 0)
                .map(i -> i*3)
                .reduce(100,(i,j) -> i+j);

        System.out.println(ans);

    }
}
