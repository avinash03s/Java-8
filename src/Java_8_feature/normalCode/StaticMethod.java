package Java_8_feature.normalCode;
interface A{
    static void run(){
        System.out.println("This is Static Method of Interface Method");
    }
    default void show(){
        System.out.println("This is Default method of Interface");
    }
    void play();
}
public class StaticMethod implements A{
    @Override
    public void play() {
        System.out.println("This is override Abstract method of Interface");
    }

    public static void main(String[] args) {
        StaticMethod obj = new StaticMethod();
        obj.show();//default method
        obj.play();//abstract method
        A.run(); //static method
    }
}

//🔹 Purpose of Default Methods
//To add new methods to interfaces without breaking existing implementations