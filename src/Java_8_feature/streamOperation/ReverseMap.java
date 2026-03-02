package Java_8_feature.streamOperation;

import java.util.HashMap;
import java.util.Map;

public class ReverseMap {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(3,30);
        map.put(2,40);
        map.put(4,20);

        map.entrySet().stream().sorted((a,b)->b.getKey()- a.getKey())
                .forEach(System.out::println);
    }
}
