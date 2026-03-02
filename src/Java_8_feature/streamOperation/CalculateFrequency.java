package Java_8_feature.streamOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculateFrequency {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8));
        Map<Integer, Long> frequency = list.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(frequency);
    }
}
