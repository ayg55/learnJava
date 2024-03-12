package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        /*
        1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı kullanıcıya  tahmin ettirip tahmin sayısını print eden  code create ediniz.
         */

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(101);

        int tahmin = 110;
        int counter = 0;

        while (tahmin != number) {
            System.out.println("sayi tahmininizi girin");
            tahmin = scan.nextInt();
            counter++;
        }
        System.out.println("tahmin sayisi : " + counter);



    }

}
