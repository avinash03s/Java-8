package top_mnc_company_interview_questions.accenture;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AccentureQuestions {

    public static void main(String[] args) {

        //write code to find duplicate element form a string using java 8
        List<Integer> element = List.of(1,2,3,4,5,6,2,4,9);
        Set<Integer> set = new HashSet<>();
        //OutPut = [2,4]

        List<Integer> list1 = element.stream().filter(x -> !set.add(x))
                .toList();
        System.out.println(list1);
    }
}
