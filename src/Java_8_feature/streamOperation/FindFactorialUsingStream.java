package Java_8_feature.streamOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFactorialUsingStream {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int product = 1;

        Integer reduce = list.stream()
                .reduce(product, (a, b) -> a * b);
        System.out.println(reduce);
    }
}
