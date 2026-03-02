package Java_8_feature.streamOperation.questions;

import java.util.*;
import java.util.stream.Collectors;


public class ReverseString {

    public static void main(String[] args) {
        String s = "avinash";
        String collect = Arrays.stream(s.split("")).sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
        System.out.println(collect);


    }
}
