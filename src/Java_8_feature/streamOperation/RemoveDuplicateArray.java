package Java_8_feature.streamOperation;

import java.util.*;
import java.util.stream.Collectors;

class Problem {

    /// using stream
    static void removeDuplicateFromArray() {
        int[] arr = {1, 1, 2, 2, 3, 4, 6, 5, 4, 5, 7, 8, 9};
        Set<Integer> collect = Arrays.stream(arr)
                .distinct()
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(collect);
        /// output : [1, 2, 3, 4, 5, 6, 7, 8, 9] remove duplicate(only unique)
        System.out.println("---------------------------------------------");
    }

    /// find duplicate
    static void findDuplicate() {
        int[] arr = {1, 1, 2, 2, 3, 4, 6, 5, 4, 5, 7, 8, 9};
        Set<Object> set = new HashSet<>();
        Set<Integer> collect = Arrays.stream(arr).filter(i -> !set.add(i))
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(collect);
        /// output : [1, 2, 4, 5] only duplicate
        System.out.println("---------------------------------------");
    }

    /// normal for loop
    static void removeDupli() {
        int[] arr = {30, 20, 10, 40, 50, 70, 60, 50, 30, 10, 20};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
        System.out.println("----------------------------------------");
    }


    /// using HashMap
    static void remove() {
        int[] arr = {30, 20, 10, 40, 50, 70, 60, 50, 30, 10, 20};
        Map<Integer, Integer> map = new HashMap<>();

        int value = 1;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], value++));
        }
        System.out.println(map);
        /// output : {50=5, 20=2, 70=6, 40=4, 10=3, 60=7, 30=1}
        System.out.println("-------------------------------------------");
    }

    /// using Set
    static void removeDupliUsingSet() {
        int[] arr = {30, 20, 10, 40, 50, 70, 60, 50, 30, 10, 20};
        Set<Object> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        /// output : [50, 20, 70, 40, 10, 60, 30]
        System.out.println("-------------------------------------------");
    }
}

public class RemoveDuplicateArray extends Problem {

    public static void main(String[] args) {
        removeDuplicateFromArray();
        findDuplicate();
        removeDupli();
        removeDupliUsingSet();
        remove();
    }
}
