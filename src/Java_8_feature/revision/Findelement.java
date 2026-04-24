package Java_8_feature.revision;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Findelement {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println("Third Max Element..");
        list.stream().sorted((a, b) -> b - a)
                .limit(3)
                .skip(2)
                .toList()
                .forEach(System.out::println);
        System.out.println("Second Max Element..");
        Optional<Integer> secondMax = list.stream().sorted((a, b) -> b - a)
                .limit(2)
                .skip(1)
                .findFirst();
        System.out.println(secondMax);
    }
}
