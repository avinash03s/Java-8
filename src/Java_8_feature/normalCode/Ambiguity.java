package Java_8_feature.normalCode;

interface ABC {
    default void show() {
        System.out.println("ABC interface say Hello !");
    }
}

interface XYZ {
    default void show() {
        System.out.println("XYZ interface say Hello !");
    }
}

public class Ambiguity implements XYZ, ABC {

    public static void main(String[] args) {
        Ambiguity ob = new Ambiguity();
        ob.show();
    }

    @Override
    public void show() {
        ABC.super.show();
    }
}

//--------------------------------------------------------------------------------------------------//
interface Parent {
    default void sayHello() {
        System.out.println("Hellow");
    }
}

class Child implements Parent {
    @Override
    public void sayHello() {
        System.out.println("Child Says Hello");
    }
}

class PCMain {
    public static void main(String[] args) {
        // Child c = new Child();
        Parent c = new Child();
        c.sayHello();
    }
}
