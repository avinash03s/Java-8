package Java_8_feature.diamondProblemRules;

interface A {
    default void show(){
        System.out.println("A");
    }
}

interface B extends A {
    @Override
    default void show() {
        System.out.println("B");
    }
}

interface C extends A {
    @Override
    default void show() {
        System.out.println("C");
    }
}

public class Ambiguity implements B, C {
    public static void main(String[] args) {
        Ambiguity ob = new Ambiguity();
        ob.show();
    }
    @Override
    public void show() {
        B.super.show();
    }
}

/// this is diamond Problem

