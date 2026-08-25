package top_mnc_company_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayClockwise {

    public static void main(String[] args) {
//        int []arr = {1,2,3,4,5,6,7,8,9};
//        int n = arr.length - 1;
//        int t = 3;
//        for (int i = 0; i < t; i++){
//            int temp = arr[n];
//            for (int j = n; j > 0; j--){
//               arr[j] = arr[j-1];
//            }
//            arr[0] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        for(int i = 0; i < 3; i++) {
            list.addFirst(list.removeLast());
        }
        System.out.println(list);

        list.stream().filter((i)->i < 3).collect(Collectors.groupingBy((i)->list.add(list.removeLast())));

    }
}
