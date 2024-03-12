package j15_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        // priod-> iki tarih arasındaki geçen tekrarlana datayı tutar..
        LocalDate today = LocalDate.now();
        LocalDate saimBD = LocalDate.of(1975,2,26);

        Period p1 = Period.between(today,saimBD);
        System.out.println("p1 = " + p1);
        System.out.println("p1.toTotalMonths() = " + p1.toTotalMonths());
        System.out.println("p1.getDays() = " + p1.getDays());
        System.out.println("p1.getYears() = " + p1.getYears());

        System.out.println("********");

        System.out.println("today = " + today);
        Period period6Days = Period.ofDays(6);
        System.out.println("today.minus(p1) = " + today.plus(period6Days));
        System.out.println("today.minus(p1) = " + today.minus(period6Days));

        // Task-> 02 Ocak 2023 başlayan sdet kursu 11 aylık planlanırsa bitiş tarihini gun sayısını print eden code create ediniz.

        Period period = Period.ofMonths(11);
        LocalDate courseStart = LocalDate.of(2024,1,2);
        System.out.println("Course finish date" + courseStart.plus(period).format(DateTimeFormatter.ISO_LOCAL_DATE));
        // ISO -> International Organization for Standardization
        // ahan da trick-> period tanımında birden çok tarih zaman girildiğinde daima sonuncu parametre derlenir. önceki parmetler ezilir
        Period date = Period.ofMonths(4).ofDays(35);
        System.out.println("today.plus(date) = " + today.plus(date));

    }
}
