package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Task->   girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
            artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.

   input: 2023
   output:false
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir yil giriniz");
        int year = scan.nextInt();

        System.out.println(lepYearControl(year));
        System.out.println(lepYearControl2(year));


    }//main sonu

    private static boolean lepYearControl2(int year) {
        return  (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static String lepYearControl(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? "true" : "false";
    }

}//Class sonu
