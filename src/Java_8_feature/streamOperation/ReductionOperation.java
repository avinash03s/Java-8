package Java_8_feature.streamOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class ReduceDemo {

    static void reduce() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 90));
//        Integer reduce = list.stream()
//                .reduce(0,(a,b)->a+b);
//      Optional<Integer> reduce = list.stream().reduce(Integer::sum); ///sum
        Optional<Integer> reduce = list.stream().reduce(Integer::max); ///min or max
        System.out.println(reduce);
    }

    static void min() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 90));
        Optional<Integer> min = list.stream().min((a, b) -> a - b);
        System.out.println(min);
    }

    static void max() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 90));
        Optional<Integer> max = list.stream().max((a, b) -> a - b);
        System.out.println(max);
    }
}

public class ReductionOperation extends ReduceDemo {

    public static void main(String[] args) {
//        reduce();
        min();
        max();
    }
}
