package Java_8_feature.functionInterfaces;

@FunctionalInterface
interface Shape {
    void draw();
}
//class Rectangle implements Shape{
//
//    @Override
//    public void draw() {
//        System.out.println("Rectangle form Rectangle class");
//    }
//}
public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
            Shape shape = ()->{
                System.out.println("Rectangle form Rectangle class");
            };
            shape.draw();
    }
}
