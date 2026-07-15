package Java_8_feature.revision;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharFreq {

    public static void main(String[] args) {
        String s = "avinash";
        Map<String, Long> collect = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);

    }
}
