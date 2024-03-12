package j15_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C05_ZoneIdDateTime {
    public static void main(String[] args) {
        // herhangi bir ulke/sehir(local) tarih-zaman datasını tutar
        LocalDate usaData = LocalDate.now(ZoneId.of("America/Los_Angeles"));
        LocalTime usaTime = LocalTime.now(ZoneId.of("America/New_York"));

        System.out.println("usaData = " + usaData); // 2024-02-26
        System.out.println("usaTime = " + usaTime); // 14:51:12.884928

        ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("Japan"));
        System.out.println("zdt1 = " + zdt1);
        // ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("America"));
        //System.out.println("zdt2 = " + zdt2); // RTE -> ZoneRulesException
        ZonedDateTime zdt3 = ZonedDateTime.now(ZoneId.of("CET"));
        System.out.println("zdt3 = " + zdt3);
    }
}
