package Java_8_feature.revision;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

    public static void main(String[] args) {
        String s = "hi i am java developer hi i am software developer";
        Map<String, Long> wordCount = Arrays.stream(s.split(" "))
                .filter(x-> !x.equals(" "))
                .collect(Collectors.groupingBy((ch) -> ch, LinkedHashMap::new, Collectors.counting()));
        System.out.println(wordCount);
    }
}
//explanation:
//first this sentence convert into stream and split with space then
//use filter method to remove spaces middle of sentence and then
//group these word,and they store in LinkedHashMap for maintain insertion order and then call counting method and then print.