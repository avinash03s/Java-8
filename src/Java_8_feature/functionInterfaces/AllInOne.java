package Java_8_feature.functionInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AllInOne {

    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 == 0;  //hold condition
        Function<Integer, Integer> function = x -> x * x; // perform operation
        Consumer<Integer> consumer = x -> System.out.println(x); // only consume/ print
        Supplier<Integer> supplier = () -> 100;  // only return not get

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }else {
            System.out.println("Value are not Even");
        }
    }
}
