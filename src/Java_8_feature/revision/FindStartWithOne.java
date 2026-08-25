package Java_8_feature.revision;

import customeAnnotation.MyAnnotation;

import java.util.List;

interface A{

}
public class FindStartWithOne {
//    List<Number> list=List.of(10,20,25,15,11,5,15,115);
//    collect all the numbers start with 1 using streams

    public static void main(String[] args) {
        List<Number> list=List.of(10,20,25,15,11,5,15,115);
        List<Number> list1 = list.stream().filter(x -> String.valueOf(x).startsWith("1"))
                .toList();
        System.out.println(list1);

        System.out.println("----------------------------------------------------");

        List<Number> list2 = list.stream()
                .filter(x -> x.toString().startsWith("1"))
                .toList();
        System.out.println(list2);

    }

}
