package Java_8_feature.streamOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 3, 4, 5, 4, 6, 7, 6, 7, 8));
        List<Integer> filterList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(filterList);
    }
}
