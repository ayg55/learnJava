package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        //Task-> girilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri pirnt eden code create ediniz
        Scanner scan = new Scanner(System.in);

        System.out.println("bir baslangic karakteri giriniz");
        char sCh = scan.next().charAt(0);
        System.out.println("bir bitis karakteri giriniz");
        char eCh = scan.next().charAt(0);

        do {
            System.out.println(sCh);
            sCh++;
        } while (sCh <= eCh);



    }
}
