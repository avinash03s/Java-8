package Java_8_feature.normalCode;

//Sort a List using Comparator with and without Lambda Expression ?

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//without lambda
class UsingComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
public class SortList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);
        Collections.sort(list,new UsingComparator());
        for (Integer i : list){
            System.out.println(i);
        }
    }
}

//with lambda
//no need to implemented class
class SortListMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);
        Collections.sort(list,(a,b)->a-b);
        for (Integer i : list){
            System.out.println(i);
        }
    }
}
