package Java_8_feature.questions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QuestionMethodClass {

    public static void question1() {
        // Given a list of integers, write a Java 8 program to separate the odd and even numbers into two separate lists.
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> evenList = list.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        System.out.println("Even List: " + evenList);

        List<Integer> oddList = list.stream()
                .filter(x -> x % 2 != 0)
                .toList();
        System.out.println("Even List: " + oddList);
    }

    public static void question2() {
        //Write a Java 8 program to remove duplicate elements from a list using the stream API and lambda expressions.
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 4, 5, 6, 99, 5, 6, 7, 8, 9));
        List<Integer> list1 = list.stream()
                .distinct() //remove duplicate
                .sorted(Comparator.naturalOrder()) // sort natural order
                .toList();
        System.out.println(list1);
    }

    public static void question3() {
        //Write a Java 8 program to find the frequency of each character in a given string using the stream API and collectors.
        String s = "Java Programing Language";
        Map<String, Long> charFrequency = Arrays.stream(s.trim().split(""))
                .filter(x -> !x.equals(" "))
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()));
        System.out.println(charFrequency);
    }

    public static void question4() {
        //Write a Java 8 program to find the frequency of each element in an array or a list using streams and collectors.
        List<String> list = new ArrayList<>(Arrays.asList("Avinash", "Surwase", "Java", "Developer", "From", "Beed", "Pune"));
        Map<String, Long> frequencyOfEachChar = list.stream()
                .flatMap(ch -> Arrays.stream(ch.split("")))
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()));
        System.out.println(frequencyOfEachChar);
    }

    public static void question5() {
        //Write a Java 8 program to sort a given list of decimal numbers in reverse order.
        List<Double> list = new ArrayList<>(Arrays.asList(10.5, 20.75, 3.14, 99.9, 00.1, 5.50));
        List<Double> decimalReverseSort = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(decimalReverseSort);
    }

    public static void question6() {
        //Given a list of strings, write a Java 8 program to join
        // the strings with '[' as a prefix, ']' as a suffix, and ',' as a delimiter
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Developer"));
        String collect = list.stream()
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println(collect);
    }

    public static void question7() {
        //Write a Java 8 program to print the numbers from a given list of integers that are multiples of 5.
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15));
        List<Integer> list1 = list.stream()
                .filter(x -> x % 5 == 0)
                .distinct()
                .sorted(Comparator.naturalOrder())
                .toList();
        System.out.println(list1);
    }

    public static void question8() {
        //Given a list of integers, write a Java 8 program to find the maximum and minimum numbers in the list.
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 4, 5, 6, 99, 5, 6, 7, 8, 9));
        Optional<Integer> max = list.stream()
                .distinct()
                .max(Comparator.naturalOrder());
        System.out.println("Max Value of List : " + max);

        Optional<Integer> min = list.stream()
                .distinct()
                .min(Comparator.naturalOrder());
        System.out.println("Min Value of List : " + min);
    }

    public static void question9() {
        //Write a Java 8 program to merge two unsorted arrays into a single sorted array using the stream API.
        int[] arr1 = {2, 4, 3, 1, 5};
        int[] arr2 = {7, 8, 6, 9};
        int[] mergeArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(mergeArray));
    }

    public static void question10() {
        //Write a Java 8 program to merge two unsorted arrays into a single sorted array without duplicates.
        int[] arr1 = {2, 4, 3, 1, 5, 3, 2, 5};
        int[] arr2 = {7, 8, 6, 9, 8, 9, 7, 4, 3};
        int[] array = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(array));
    }

    public static void question11() {
        //Write a Java 8 program to get the three maximum and three minimum numbers from a given list of integers.
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> maxThree = list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println("Max Three : " + maxThree);

        List<Integer> minThree = list.stream()
                .sorted(Comparator.naturalOrder())
                .limit(3)
                .toList();
        System.out.println("Min Three : " + minThree);
    }

    public static void question12() {
        //Write a Java 8 program to check if two strings are anagrams or not using the stream API and lambda expressions.
    }

    public static void question13() {
        //Write a Java 8 program to find the sum of all digits of a given number.
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Optional<Integer> sum = list.stream().reduce(Integer::sum);
        System.out.println(sum);
    }

    public static void question14() {
        //Write a Java 8 program to find the second-largest number in an integer array.
        int[] arr1 = {2, 4, 3, 1, 5};
        Optional<Integer> secondLargest = Arrays.stream(arr1)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(secondLargest);
    }

    public static void question15() {
        //Write a Java 8 program to sort a given list of strings according to the increasing order of their length.
        List<String> list = new ArrayList<>(Arrays.asList("Avinashs", "Surwase", "Java", "Developer", "Froma", "Bee", "Punepu"));
        List<String> sortListByLength = list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
        System.out.println(sortListByLength);
    }

    public static void question16() {
        //Write a Java 8 program to find the sum and average of all elements in an integer array.
        int[] arr1 = {2, 4, 3, 1, 5};
        OptionalInt sum = Arrays.stream(arr1)
                .reduce(Integer::sum);
        int average = sum.orElse(0) / arr1.length;
        System.out.println("Sum of Element : " + sum + " " + "Average of Element : " + average);
    }

    public static void question17() {
        //Write a Java 8 program to find the common elements between two arrays using streams.
        int[] arr1 = {2, 4, 3, 1, 5, 3, 2, 5};
        int[] arr2 = {7, 8, 6, 9, 8, 9, 7, 4, 3};
        Set<Integer> set = new HashSet<>();
        List<Integer> commonElement = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .boxed()
                .filter(x -> !set.add(x))
                .toList();
        System.out.println("commonElement : " + commonElement);
    }

    public static void question18() {
        //Write a Java 8 program to reverse each word of a given string using the stream API and lambda expressions.
        String s = "Java";
        List<String> list = Arrays.stream(s.split(""))
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(list);
    }

    public static void question19() {
        //Write a Java 8 program to find the sum of the first 10 natural numbers using streams.

    }

    public static void question20() {
        //Write a Java 8 program to print the duplicate characters in a string.
        String s = "JavaDeveloper";
        Set<String> set = new HashSet<>();
        List<String> duplicateChar = Arrays.stream(s.split(""))
                .filter(ch -> !set.add(ch))
                .toList();
        System.out.println(duplicateChar);
    }

    public static void question21() {
        //Write a Java 8 program to find the first repeated character in a string.
        String s = "JavaDeveloper";
        LinkedHashMap<String, Long> count = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()));
        Optional<String> firstRepeated = count.entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(firstRepeated);
        /// logic - first calculate count of each and every char then using there count
        /// filter by repeated value getValue > 1 and then extract key using Map.Entry
        /// and then use findFirst()
    }

    public static void question22() {
        //Write a Java 8 program to find the first non-repeated character in a string.
        String s = "JavaDeveloper";
        LinkedHashMap<String, Long> collect = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()));
        Optional<String> first = collect.entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(first);
    }

    public static void question23() {
        //Given a string find out duplicate character and its count .
        String s = "java";
        Set<String> set = new HashSet<>();
        List<String> duplicateChar = Arrays.stream(s.split(""))
                .filter(x -> !set.add(x))
                .toList();
        System.out.println("Duplicate Char: " + duplicateChar);
    }

    public static void question24() {
        //find repeated word in the sentence
        String s = "I am a java developer and I am proud of it";
        Map<String, Long> count = Arrays.stream(s.split(" "))
                .filter(x -> !x.equals(" "))
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        List<String> repeatedWord = count.entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(repeatedWord);
    }

    public static void question25() {
        //print the last element of list;
        List<String> stringList = new ArrayList<>(Arrays.asList("Java", "Developer", "Avinash", "Surwase"));
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Optional<String> findLastElement = stringList.stream().reduce((x, y) -> y);
        Optional<Integer> reduce = integerList.stream().reduce((x, y) -> y);
        System.out.println("Last Element Of String List: " + findLastElement);
        System.out.println("Last Element of Integer List: " + reduce);
    }

    public static void question26(){
        //swip string without using tem variable
        String s1 = "Avinash";
        String s2 = "Surwase";
        s1 = s1 + s2;
        s2 = s1.substring(0,s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println(s1);
        System.out.println(s2);
    }
}
