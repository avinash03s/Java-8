package Java_8_feature.streamOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindThirdMax {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        List<Integer> list1 = list.stream().sorted(Collections.reverseOrder())
                .limit(3) /// process only first n element
                .skip(2) /// skip first n element
                .toList();
        System.out.println(list1);
    }
}
