package Java_8_feature.normalCode;

import java.util.*;

//Sort a TreeSet using Comparator with Lambda Expression ?
class TreeSetSort implements Comparator<Integer> {
    //without lambda
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

public class SortTreeSet {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(new TreeSetSort());
        set.add(5);
        set.add(3);
        set.add(1);
        set.add(4);
        set.add(2);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

//with lambda
class SortTreeSetMain {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>((a,b)->b-a);
        set.add(5);
        set.add(3);
        set.add(1);
        set.add(4);
        set.add(2);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

