package Java_8_feature.streamOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListUsingStream {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 4, 3, 5, 4, 6, 9, 7, 8, 0, 5, 4));

        System.out.println("Natural Ordering");
        List<Integer> sortedList = list.stream()
                .distinct()
                .sorted()
                .peek(x-> System.out.println(x))
                .collect(Collectors.toList());
        System.out.println(sortedList);
        System.out.println("-----------------------------");

        List<Integer> customizeSort = list.stream()
                .distinct()  // used remove duplicate
                .sorted((a, b) -> b - a) // sorting using comparator
                .limit(7) // i want only limited element
                .skip(1) // skip one element
                .toList(); // return as list not stream
        System.out.println("Descending Ordering");
        System.out.println(customizeSort);
    }
}
