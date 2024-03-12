package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        for (int i = (sayi1 < sayi2 ? sayi1 : sayi2); i < (sayi1 > sayi2 ? sayi1 : sayi2); i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }

        }


    }
}
