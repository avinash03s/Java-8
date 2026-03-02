package Java_8_feature.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Demo {

    static void getName(String s) {
        System.out.println(s);
    }

    void getId(int a) {
        System.out.println(a * 2);
    }
}

public class MethodReferenceDemo {

    public static void main(String[] args) {

        Demo ob = new Demo();

        List<String> list = new ArrayList<>(Arrays.asList("Avinash", "Pramod", "Sushil", "Avinash K"));
        list.forEach(Demo::getName);

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        integerList.forEach(ob::getId);
    }
}
// method reference used to refer to particular method and replace with lambda its possible when method is present;
// for constructor reference use "new" key word only ; ex: (Student::new) 
