package Java_8_feature.diamondProblemRules;

//if your class inherit multiple with same signature then a method form super class is selected
//(Remember a class can extend only one class)

interface One {
    default void m1() {
        System.out.println("Interface One Method");
    }
}

interface Two extends One {

    @Override
    default void m1() {
        System.out.println("Interface Two Method");
    }
}

class Child implements One, Two {

    @Override
    public void m1() {
        System.out.println("Child Class method");
    }
}

public class Rule1 extends Child implements One, Two {

    public static void main(String[] args) {
        Rule1 ob = new Rule1();
        ob.m1();
    }
}
