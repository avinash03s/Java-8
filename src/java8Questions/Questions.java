package java8Questions;

import java.util.Arrays;
import java.util.List;

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
        //
    }
}
