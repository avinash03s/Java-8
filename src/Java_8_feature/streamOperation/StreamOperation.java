package Java_8_feature.streamOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StreamProblem {

    static void sortListByLength() {
        List<String> list = new ArrayList<>(Arrays.asList("avinash", "java", "javaprograming", "xyz", "a", "ab"));
        list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);

//        List<String> sortByLength = list.stream()
//                .sorted((x, y) -> x.length() - y.length())
//                .toList();
//        System.out.println(sortByLength);
        System.out.println("-----------------------------------------------------------");
    }

    static void findEvenFromList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.stream().filter((x)->x % 2 == 0).forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");
    }

    static void calculateSumOfList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));
        Integer integer = list.stream().reduce(Integer::sum).orElse(0);
        System.out.println(integer);
        System.out.println("-----------------------------------------------------------");
    }
}



public class StreamOperation {

    public static void main(String[] args) {
        StreamProblem.sortListByLength();
        StreamProblem.findEvenFromList();
        StreamProblem.calculateSumOfList();
    }
}
