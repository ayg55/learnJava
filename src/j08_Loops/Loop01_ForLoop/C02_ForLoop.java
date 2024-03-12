package j08_Loops.Loop01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {

    public static void main(String[] args) {

        // Task-> girlen sayıdan 100'e kadar 4'un katı olan tamsayıları yan yana print eden code create ediniz

        Scanner scan = new Scanner(System.in);

        System.out.println("bir sayi giriniz : ");
        int number = scan.nextInt();

        if (number < 100 && number > 0) {
            for (int i = number; i < 100; i++) {
                if (i % 4 == 0) {
                    System.out.print(i + " ");
                }

            }
        }else System.out.println("Bu sayi kabul edilmedi");



    }

}
