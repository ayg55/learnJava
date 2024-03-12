package j15_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date1 = today.plusDays(33);
        LocalDate date2 = today.minusDays(66);
        LocalDate saimBD = LocalDate.of(1975,02,26);
        System.out.println("saimBD = " + saimBD);
        System.out.println("date2 = " + date2);
        System.out.println("date1 = " + date1);
        System.out.println("today = " + today);

        System.out.println("date1.isLeapYear() = " + date1.isLeapYear());
        System.out.println("date1.isAfter(saimBD) = " + date1.isAfter(saimBD));
        System.out.println("saimBD.isBefore(date2) = " + saimBD.isBefore(date2));

        System.out.println("********");

        System.out.println("today.compareTo(saimBD) = " + today.compareTo(saimBD));
        System.out.println("date1.compareTo(date2) = " + date1.compareTo(date2));
        System.out.println("date2.compareTo(date2) = " + date2.compareTo(date2));
    }
}
