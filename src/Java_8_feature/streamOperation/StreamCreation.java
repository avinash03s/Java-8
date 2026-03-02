package Java_8_feature.streamOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("Avinash", "Arjun", "Surwase"));
        List<String> stream = stringList.stream().toList();
        System.out.println(stream);
        System.out.println("-----------------------");

        System.out.println("Array");
        String[] arr = {"A", "B", "C", "D"};
        List<String> myStream = Arrays.stream(arr).toList();
        System.out.println(myStream);
        System.out.println("----------------------------");

        System.out.println("Create Directly Stream");
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        System.out.println(integerStream);
        System.out.println("-----------------");

        System.out.println("Using iterate type loop");
        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(50);
        System.out.println(limit);
    }
}
