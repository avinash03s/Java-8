package Java_8_feature.functionInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<List<Integer>> consumer = li -> {
            for (Integer i : li) {
                System.out.println(i);
            }
        };
        consumer.accept(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    }
}

class DemoConsumer {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Avinash","Rahul","Pramod","Sushil"));
        Consumer<List<String> > consumer = lii ->{
          for (String s : lii){
              System.out.println(s);
          }
        };
        consumer.accept(list);
    }
}

class PrintTable {

    public static void main(String[] args) {
        Consumer<List<Integer>> consumer = table ->{
            for (Integer i : table){
                System.out.println(i * 2);
            }
        };
        consumer.accept(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    }
}
