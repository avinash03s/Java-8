package Java_8_feature.streamOperation;

import java.util.*;
import java.util.stream.Collectors;

public class FirstRepeateElement {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(22, 1, 1, 11, 2, 45, 6, 4, 3, 5));
        Map<Integer, Long> collect = list.stream()
                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()));
        Optional<Integer> first = collect.entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .limit(3)
                .skip(2)
                .findFirst();
        System.out.println(first);
    }
}
