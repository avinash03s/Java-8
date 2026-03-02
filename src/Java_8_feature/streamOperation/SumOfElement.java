package Java_8_feature.streamOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class SumOfElement {

    public static void main(String[] args) {
//        Operation.sumElement();
//        Operation.filterName();
//        Operation.squareAndSorting();
        Operation.countOccurrenceOfChar();
    }
}

class Operation {
    public static void sumElement() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Optional<Integer> list1 = list.stream().reduce(Integer::sum);
        System.out.println(list1);
    }

    static void filterName(){
        List<String> list = new ArrayList<>(Arrays.asList("Avinash","Ram","Raj","Pramod"));
        List<String> list1 = list.stream().filter(x -> x.length() > 3).toList();
        System.out.println(list1);

    }

    static void squareAndSorting() {
        List<Integer> list = new ArrayList<>(Arrays.asList(4,2,3,6,5));
        final List<Integer> list1 = list.stream().map(x -> x * x).sorted().toList();
        System.out.println(list1);
    }

    static void countOccurrenceOfChar() {
        String s = "Hello Avinash";
        long count = s.chars().filter(x -> x == 'l').count();
        System.out.println(count);
    }
}

