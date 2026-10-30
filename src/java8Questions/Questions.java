package java8Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Questions {

    public static void q1(){
        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream()
                .map(x-> x + "")//convert integer to string
                .filter(x-> x.startsWith("1"))
                .forEach(System.out::println);
    }

    public static void q2(){
        //sort map by key
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Avinash");
        map.put(3,"Rahul");
        map.put(2,"Karan");

        //sort map by key
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("------------------");
        /// sort map by value
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
