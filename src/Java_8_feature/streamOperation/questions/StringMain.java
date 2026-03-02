package Java_8_feature.streamOperation.questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class StringProblem {

    public static void stringFirstRepeatChar() {
        String s = "programming";

        Map<String, Long> collect = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()));

        Optional<String> list = collect.entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(list);
    }

    public static void stringSecondRepeatChar(){
        String s = "programming";
        LinkedHashMap<String, Long> collect = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()));

        Optional<String> first = collect.entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .limit(2)
                .skip(1)
                .findFirst();
        System.out.println(first);
    }
}

public class StringMain extends StringProblem {

    public static void main(String[] args) {
        stringFirstRepeatChar();
        stringSecondRepeatChar();
    }
}
