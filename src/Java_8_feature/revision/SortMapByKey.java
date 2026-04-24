package Java_8_feature.revision;

import java.util.HashMap;
import java.util.Map;

public class SortMapByKey {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(103, "avinash");
        map.put(100, "time");
        map.put(102, "key");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("----------");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("--------");
        map.entrySet().stream()
                .sorted((a, b) -> b.getKey() - a.getKey())
                .forEach(System.out::println);
        System.out.println("--------------");
        map.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(System.out::println);
    }
}
//explanation:
// sort by key and values using Map.Entry
