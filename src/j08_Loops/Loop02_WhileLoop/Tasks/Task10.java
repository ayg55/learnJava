package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");
        int number = scan.nextInt();
        int i = 1;

        while (i <= number) {
            System.out.print(i % 2 == 1 ? i + " " : "");
            i++;
        }



    }
}
