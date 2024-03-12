package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        /* Task->
         Girilen bir sayı için

		 Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
		 Eger 10 dan buyuk ise "Buyuksun!" yazdirin
		 Eger 10 dan kucuk ise "Normalsin!" yazdirin

		 Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
		 Eger -10 dan buyuk ise "Negatifsin!" yazdirin
		 Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz : ");
        int number = scan.nextInt();

        if (number > 0) {
            if (number >= 10) {
                System.out.println("Buyuksun");
            } else {
                System.out.println("Normalsin");
            }
        }
        if (number >= -10 && number < 0) {
            System.out.println("Negetifsin");
        } else if (number < -10) {
            System.out.println("Cok negatifsin!");
        } else System.out.println("Notr'dur");


        /*
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz : ");
        int number = scan.nextInt();

        if (number > 10) {
            System.out.println("Buyuksun");
        } else if (number > 0 && number < 10) {
            System.out.println("Normalsin");
        } else if (number < 0 && number > -10) {
            System.out.println("Negetifsin");
        } else if (number < -10) {
            System.out.println("Cok negatifsin!");
        } else System.out.println("Lutfen baska bir sayi giriniz");

         */


    }
}
