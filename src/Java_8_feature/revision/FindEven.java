package Java_8_feature.revision;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindEven {

    public static void main(String[] args) {
        twoDimen();
        threeDimen();
        printUnqElement();
        sortList();
        reverseString();
    }

    public static void twoDimen(){
        int [][]arr={{1,2,3},{4,5,6}};
        Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .filter(x->x%2==0)
                .forEach(System.out::println);
        System.out.println("-----------------------");
    }

    public static void threeDimen(){
        int [][][] arr={{{1,2,3},{4,5,6},{7,8,9}}};
        Arrays.stream(arr)
                .flatMap(Arrays::stream)
                .flatMapToInt(Arrays::stream)
                .filter(x->x%2==0)
                .forEach(System.out::println);
    }

    public static void printUnqElement(){
        int[] a1={1,2,3,4,5,6};
        int[] a2={1,2,3,69,7};
        Set<Integer> collect = Stream.concat(
                        Arrays.stream(a1).boxed(), Arrays.stream(a2).boxed())
                .collect(Collectors.toSet());
        System.out.println(collect);
    }

    public static void sortList(){
        List<Integer> list = new ArrayList<>(Arrays.asList(5,3,2,4,1));
        Collections.sort(list);//ascending order
        System.out.println(list);
        Collections.sort(list.reversed());//descending order
        System.out.println(list);
    }

    public static void reverseString(){
        String s = "java";
        for (int i = s.length()-1; i >= 0; i--){
            System.out.println(s.charAt(i));
        }
    }

//    public static void reverseStringUseStream(){
//        String s = "java";
//        Arrays.stream(s.split(""))
//
//    }
}
//