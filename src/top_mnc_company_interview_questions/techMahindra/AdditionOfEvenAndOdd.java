package top_mnc_company_interview_questions.techMahindra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AdditionOfEvenAndOdd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
   /*     Stream.concat(Arrays.stream(arr).boxed().filter((x)->x % 2 == 0).map((x)->x + x),
                Arrays.stream(arr).boxed().filter((x)->x %2 != 0).map((x)-> x + x)).forEach(System.out::println);*/

         List<Integer> list1 = Arrays.stream(arr).filter((x) -> x % 2 == 0).boxed().toList();
        System.out.println(list1);
    }
}
