package Java_8_feature.dateAndTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDateTimeDemo {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        System.out.println(now.getZone());

        System.out.println("---Available Zone---");
        Set<String> avl = ZoneId.getAvailableZoneIds();
        int count = 0;
        for (String s : avl) {
            count++;
            System.out.println(count + " : " + s);
        }
    }
}
