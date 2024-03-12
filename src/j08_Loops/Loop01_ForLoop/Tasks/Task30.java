package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki tamsayıların toplamını print eden code create ediniz

        Scanner scan = new Scanner(System.in);

        System.out.println("1. sayiyi giriniz");
        int number1 = scan.nextInt();
        System.out.println("2. sayiyi giriniz");
        int number2 = scan.nextInt();
        int total = 0;

        for (int i = number1 + 1; i < number2; i++) {
            total += i;
        }
        System.out.println("total = " + total);



    }
}
