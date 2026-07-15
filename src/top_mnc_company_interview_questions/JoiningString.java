package top_mnc_company_interview_questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class JoiningString {

    public static void main(String[] args) {
        String s = "aabbcc";
        LinkedHashMap<String, Long> count = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()));

        String combine = count.entrySet().stream().map(x -> x.getKey() + x.getValue())
                .collect(Collectors.joining());
        System.out.println(combine);
    }
}
/* first calculate count then using this count join together using Collectors.joining() method with key - element
  and value - count
* */
