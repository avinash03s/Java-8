package Java_8_feature.lambdaPractice;

public class ThreadDemo {

    public static void main(String[] args) {
//        Runnable thread1 = () -> {
//            for (int i = 0; i < 4; i++) {
//                System.out.println("Thread 1");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//
//        Runnable thread2 = () -> {
//            for (int i = 0; i < 4; i++) {
//                System.out.println("Thread 2");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//
//        Runnable thread3 = () -> {
//            for (int i = 0; i < 4; i++) {
//                System.out.println("Thread 3");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//
//        Thread t1 = new Thread(thread1);
//        Thread t2 = new Thread(thread2);
//        Thread t3 = new Thread(thread3);
//        t1.start();
//        t2.start();
//        t3.start();

        Runnable thread4 = ()-> {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i * 2);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread t4 = new Thread(thread4);
        t4.start();

    }
}
