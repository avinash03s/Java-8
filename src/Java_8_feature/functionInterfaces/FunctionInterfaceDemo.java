package Java_8_feature.functionInterfaces;

@FunctionalInterface
interface Demo {
    void add(int a, int b);

    default void sum() {
        System.out.println("This is Default Sum Method");
    }
}

@FunctionalInterface
interface B {
    void add();
}

public class FunctionInterfaceDemo {

    public static void main(String[] args) {
        Demo demo = (a, b) -> {
            int result = a + b;
            System.out.println("This is Function Demo: " + result);
        };
        demo.add(40, 5);

        B b = () -> {
            System.out.println("B interface add methods");
        };
        b.add();
    }


}
