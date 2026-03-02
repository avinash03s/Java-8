package Java_8_feature.lambdaPractice;

public class MyClass {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = ()->{
            for (int i = 0; i < 10; i++){
                System.out.println("Child Thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread.yield();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 10; i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
    }
}

// With Lambda Expression
// We will remove the implementation class MyClass and write Lambda Expression for the same.
// Functional Interface can act as a type for Lambda Expression.
// Whose implementation we do using Lambda Expression?
// Of the one and only abstract method inside the Functional Interface.

