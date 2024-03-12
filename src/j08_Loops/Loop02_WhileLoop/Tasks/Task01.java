package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz

        Scanner scan = new Scanner(System.in);
        int total = 0;
        int counter = 0;
        while (total <= 333) {
            System.out.println("bir sayi giriniz");
            int number = scan.nextInt();
            total += number;
            counter++;
        }
        System.out.println(counter + " sayinin toplami " + total);







    }
}
