package questionpractice;

import java.util.*;
import java.util.stream.Collectors;

public class QuestionMethods {

    public static void q1(){
        // Write a function to find out duplicate words in a
        //given string?

        Set<String > set = new HashSet<>();
        String s = "javaa";
        List<String> list = Arrays.stream(s.split(""))
                .filter(x -> !set.add(x))
                .distinct()
                .toList();
        System.out.println(list);
    }

    public static void q2(){
//        Write a java program to Move all zeroes to end of
//        array?
//        Input:  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
//        Output: arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int[] result = new int[arr.length];
        int index = 0;
        // First add non-zero elements
        for (int num : arr) {
            if (num != 0) {
                result[index++] = num;
            }
        }
        System.out.println(Arrays.toString(result));
    }

    public static void q3(){
        //calculate the count the number of occurrences of each character in a string
        String s = "Java J2EE Java JSP J2EE";
        Map<String, Long> count = Arrays.stream(s.split(""))
                .filter(ch->!ch.equals(" "))
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()));
        System.out.println(count);
    }

    public static void q4(){
        //find duplicate characters in a string
        String s = "Better Butter";
        final Map<String, Long> duplicateCount = Arrays.stream(s.split(""))
                .filter(ch->!ch.equals(" "))
                .collect(Collectors.groupingBy(ch -> ch,LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                        .stream()
                                .filter(ch->ch.getValue() > 1)
                                        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(duplicateCount);
    }

    public static void q5(){
        //Write a Java program to reverse a string
        String s = "Java";
        String s1 = "";
        for (int i = s.length()-1;i> 0;i--){
            s1 += s.charAt(i);
        }
        System.out.println(s1);
    }

    public static void q6(){
        //find non-repeated characters from given string "avinash surwase" ?
        String s = "avinash surwase";
        Optional<String> first = Arrays.stream(s.split(""))
                .filter(ch -> !ch.equals(" "))
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(first);

    }
}
