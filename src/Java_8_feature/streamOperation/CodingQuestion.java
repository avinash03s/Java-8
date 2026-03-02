package Java_8_feature.streamOperation;

import java.util.*;
import java.util.stream.Collectors;

public class CodingQuestion {

    public static void main(String[] args) {

        /// Interview Question

        String s1 = "Avinash Surwase";
        String s = s1.toLowerCase();
        Map<Object, Long> collect = Arrays.stream(s.split(""))
                .filter(ch -> !ch.equals(" "))
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        for (Map.Entry<Object, Long> m : collect.entrySet()) {
            System.out.println(m.getKey() + "=" + m.getValue());
        }
    }
}
interface AA{
    void add(int a, int b);
}

/// lambda with try catch block
class Main12{

    public static void main(String[] args) {
        AA aa = (a,b) -> {
            try {
                System.out.println(10/0);
            }catch (RuntimeException e){
                System.out.println("Hi");
            }
        };

        aa.add(10,0);
    }
}