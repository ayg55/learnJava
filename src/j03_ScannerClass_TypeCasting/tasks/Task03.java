package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu alıp ayda yilda ve 40 yilda kac gununun uykuda gectigini print eden code create ediniz
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Gunluk kac saat uyuyorsunuz : ");
        double saat=scan.nextDouble();
        double uykuA=(30*saat/24);
        int ay= (int) uykuA;
        double uykuY=(12*30*saat/24);
        int yil= (int) uykuY;
        double uykuKirk=(40*12*30*saat/24);
        int kirk= (int) uykuKirk;

        System.out.println("Ayda "+ ay+", yilda "+yil+", 40 yilda "+kirk+" gununuz uykuda geciyor.");



    }
}
