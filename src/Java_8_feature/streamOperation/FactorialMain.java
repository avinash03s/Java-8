package Java_8_feature.streamOperation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ProblemXYZ {

    static void factorialForNumber() {
        int factorial = 1;

        for (int i = 1; i < 10; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 1 to 10: " + factorial);
        System.out.println("---------------------------");
    }

    static void arrayElementFactorial() {
        int[] arr = {3, 5, 33, 22, 54, 2};
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        System.out.println("Array Factorial : " + product);
        System.out.println("--------------------------------");
    }

    static void factorialUseStream() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 4, 1, 2, 5, 7, 6));

        Integer reduce = list.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Factorial of List using Stream : " + reduce);
        System.out.println("-------------------------------");
    }
}

public class FactorialMain extends ProblemXYZ {

    public static void main(String[] args) {
        factorialForNumber();
        arrayElementFactorial();
        factorialUseStream();

    }
}

