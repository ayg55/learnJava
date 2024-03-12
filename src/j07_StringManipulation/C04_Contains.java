package j07_StringManipulation;

import java.util.Scanner;

public class C04_Contains {

    /*
    String içersinde istenen stringinin varlığını kontrol eder boolean değer return eder..
    char parametre -> CTE
     */

    public static void main(String[] args) {

        String str1 = "Basari gayrete asiktir :)";
        System.out.println("str1 = " + str1);
        System.out.println("str1.contains(\"Basari\") = " + str1.contains("Basari"));
        //str1.contains('a') // Cte -> char deger girilmez
        System.out.println("str1.contains(\"a\") = " + str1.contains("a"));
        System.out.println("str1.contains(\"Dogukana\") = " + str1.contains("Dogukana"));

        // Task-> girilen bir metinde istenen kelimenin varlığını kontrol eden code create ediniz...

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz : ");
        String metin = scan.nextLine();
        System.out.println("Metinde sorgulatmak istediginiz kelimeyi giriniz");
        String kelime = scan.next();
        System.out.println("metin.contains(kelime) = " + metin.contains(kelime));
        System.out.println(metin.contains(kelime) ? "girilen " + metin + "de aranan " + kelime + " mevcuttur" : "girilen " + metin + "de aranan " + kelime + " mevcut degildir");


    }
}
