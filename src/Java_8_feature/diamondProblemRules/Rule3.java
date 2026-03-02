package Java_8_feature.diamondProblemRules;

//if your class does not extend any class and inherit multiple method with same signature from
//multiple interfaces which does not belong to same hierarchy, then override that method and form
//within the body explicitly call desired method as
//InterfaceName.Super.methodName();

interface Backend {

    default void server() {
        System.out.println("Backend Server");
    }
}

interface FrontEnd {

    default void server() {
        System.out.println("FrontEnd Server");
    }
}

public class Rule3 implements Backend, FrontEnd {

    @Override
    public void server() {
        Backend.super.server();
    }

    public static void main(String[] args) {
        Rule3 ob = new Rule3();
        ob.server();
    }
}
