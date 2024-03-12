package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
  /*
  Task-> Girilen sayıyı 0 olmadıgı sürece girilen sayıların toplamını print eden code create ediniz.
   */

        Scanner scan = new Scanner(System.in);

        int total = 0;
        int input;

        do {
            System.out.println("bir sayi giriniz. bitirmek icin 0 girin");
            input = scan.nextInt();
            total += input;
        } while (input != 0);

        System.out.println(total);











    }
}
