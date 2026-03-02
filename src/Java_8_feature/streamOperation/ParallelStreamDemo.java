package Java_8_feature.streamOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Stream<Integer> integerStream = list.parallelStream(); // it is used to big list then his use multiple thread work;
    }
}
