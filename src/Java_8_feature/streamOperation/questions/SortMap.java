package Java_8_feature.streamOperation.questions;

import java.util.*;

class SortBy {

    static Map<String, Integer> getMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Z", 5);
        map.put("C", 4);
        map.put("A", 3);
        map.put("D", 1);
        map.put("B", 2);
        return map;
    }

    static void sortByValues() {
        Map<String, Integer> map = getMap();
        /// natural order
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        /// reverse order
        map.entrySet().stream().sorted((a,b)->b.getValue().compareTo(a.getValue()))
                .forEach(System.out::println);
    }

    static void sortByKeys() {
        Map<String, Integer> map = getMap();
        /// natural order
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        /// reverse order
        map.entrySet().stream().sorted((a,b)->b.getKey().compareTo(a.getKey()))
                .forEach(System.out::println);
    }

}

public class SortMap extends SortBy {

    public static void main(String[] args) {
        sortByValues();
        System.out.println("---------------------------------------------------------");
        sortByKeys();
    }
}


