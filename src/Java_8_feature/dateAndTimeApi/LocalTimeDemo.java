package Java_8_feature.dateAndTimeApi;

import java.time.LocalTime;

public class LocalTimeDemo {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        System.out.println("Custom time");
        LocalTime time = LocalTime.of(3,30);
        System.out.println(time);
    }
}
