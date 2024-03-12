package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
         Task->
         Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= Java
         name2= haluk
         Print ==> Jahalukva
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("ilk kelimeyi giriniz");
        String w1 = scan.next();
        System.out.println("ikinci kelimeyi giriniz");
        String w2 = scan.next();

        if (w1.length() % 2 == 0) {
            int middelIndex = w1.length() / 2;
            String firstPiece = w1.substring(0 , middelIndex);
            String secondPiece = w1.substring(middelIndex);
            System.out.println(firstPiece + w2 + secondPiece);
        } else System.out.println("kelime2 kelime1 eklenemez");


















    }
}
