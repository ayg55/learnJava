package j15_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {
        LocalTime night = LocalTime.of(0, 0,0);
        LocalTime day = LocalTime.of(12, 30);

        Duration diffirence = Duration.between(night,day);
        Duration diffirence2 = Duration.between(day,night);

        System.out.println("diffirence = " + diffirence);
        System.out.println("diffirence2 = " + diffirence2);

        System.out.println("diffirence2.getSeconds() = " + diffirence2.getSeconds());
    }
}
