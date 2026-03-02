package Java_8_feature.diamondProblemRules;

//if your class does not extend any class and inherit multiple method with same signature from
//multiple interfaces which belong to same hierarchy, then method from specific interface is selected
//(if interface x extend y then x is most specific than y)

interface User {

    default void service() {
        System.out.println("Service method from user Interface");
    }
}

interface Admin extends User {

    @Override
    default void service() {
        System.out.println("Service method form Admin interface");
    }
}

public class Rule2 implements Admin, User {

    public static void main(String[] args) {
        Rule2 ob = new Rule2();
        ob.service();
    }
}
