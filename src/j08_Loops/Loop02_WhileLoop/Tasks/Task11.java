package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
        Scanner scan = new Scanner(System.in);


        int total = 0;
        int counter = 0;
        int number = 1;

        while (number != 0) {
            System.out.println("Bir sayi giriniz");
            number = scan.nextInt();
            counter++;
            total += number;
        }
        System.out.println((counter - 1) + " sayinin toplami " + total);







    }
}
