package Java_8_feature.streamOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 12));
//        List<Integer> filterList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(filterList);

//        List<Integer> mapedList = filterList.stream().map(x -> x / 2).collect(Collectors.toList());
//        System.out.println(mapedList);

        List<Integer> filterList2 = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).collect(Collectors.toList());
        System.out.println(filterList2);
    }
}
