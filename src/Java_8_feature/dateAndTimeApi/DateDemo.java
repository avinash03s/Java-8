package Java_8_feature.dateAndTimeApi;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateDemo {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        System.out.println("------Custom Date------");
        LocalDate localDate = LocalDate.of(2005, 8, 15);
        System.out.println(localDate);

        LocalTime now1 = LocalTime.now();
        System.out.println(now1);

        System.out.println("------Custom Time------");
        LocalTime localTime = LocalTime.of(5, 30);
        System.out.println(localTime);
    }
}
