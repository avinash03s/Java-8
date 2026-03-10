package Java_8_feature.diamondProblemRules;

interface ParentOne{
    default void show(){
        System.out.println("ParentOne");
    }
}

interface ParentTwo{
    default void show(){
        System.out.println("ParentTwo");
    }
}
public class SolveUsing implements ParentOne,ParentTwo{
    @Override
    public void show() {
        ParentOne.super.show();
    }
    public static void main(String[] args) {
        SolveUsing ob = new SolveUsing();
        ob.show();
    }
}
///this is ambiguity problem solve using default method
/// using - (InterfaceName.super.MethodName)