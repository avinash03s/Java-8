package Java_8_feature.functionInterfaces.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesDemo {

    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 == 0;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (Integer i : list) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }
    }
}
