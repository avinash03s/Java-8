package top_mnc_company_interview_questions.cognizant;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cognizant {

    public static void main(String[] args) {
        //write code to move all zero on the right side of List using Java 8
        //out put : [1,-3,5,-2,8,4,0,0,0,0]
        List<Integer> numbers = List.of(1, 0, -3, 0, 5, -2, 0, 8, 0, 4);
        List<Integer> list = Stream.concat(numbers.stream().filter(x -> x != 0),
                        numbers.stream().filter(x -> x == 0))
                .toList();
        System.out.println(list);
/// -----------------------------------------------------------------------------------------------------------
        List<Integer> list1 = Stream.concat(numbers.stream().filter(x -> x == 0),
                numbers.stream().filter(x -> x != 0)).toList();
        System.out.println(list1);
///----------------------------------------------------------------------------------------------------------------

        //we have one map with one String key and Integer Values need to sort the map
        //by value not key using java 8.
        Map<String,Integer> map = new HashMap<>();
        map.put("A",4);
        map.put("D",1);
        map.put("B",3);
        map.put("C",2);
        LinkedHashMap<String, Integer> collect = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a1, a2) -> a1, LinkedHashMap::new));
        System.out.println(collect);

        Stream<Map.Entry<String, Integer>> sorted = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue());
        System.out.println(sorted);
///--------------------------------------------------------------------------------------------------------------------
    }
}
