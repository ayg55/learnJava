package j15_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {
        // LocalDate  -> sadece gun-ay-yıl datatlarını tutar(stored)
        LocalDate today = LocalDate.now();
        //Trick -> LocalDate variable icin new keyword kullanilmaz -> CTE

        System.out.println("today = " + today); //2024-02-26
        System.out.println("today.getYear() = " + today.getYear()); // 2024
        System.out.println("today.getMonth() = " + today.getMonth()); //FEBRUARY
        System.out.println("today.getDayOfMonth() = " + today.getDayOfMonth()); //26
        System.out.println("today.getDayOfYear() = " + today.getDayOfYear()); //57
        System.out.println("today.getDayOfWeek() = " + today.getDayOfWeek()); //MONDAY
        System.out.println("today.getMonthValue() = " + today.getMonthValue()); //2

        System.out.println("***********");

        LocalDate date1 = LocalDate.of(1974, 5,22);
        LocalDate date2 = LocalDate.of(1985, Month.MARCH,12);
        //tanimlanan bir date oncesi minus() -> sonrasinda ise plus() meth kullanilir.

        System.out.println("date1 = " + date1);
        System.out.println(date1.minusYears(34).plusMonths(34).plusDays(34));
        System.out.println("date1 = " + date1);

    }
}
