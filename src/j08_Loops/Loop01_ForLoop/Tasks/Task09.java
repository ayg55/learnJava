package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * * *
      * * * *
      * * *
      * *
      *

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir boyut giriniz : ");
        int boyut = scan.nextInt();

        for (int kat = 1; kat <= boyut; kat++) {
            for (int daire = 1; daire <= kat; daire++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int kat = 1; kat <= boyut; kat++) {
            for (int daire = 1; daire <= boyut - kat; daire++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        // 2. yol

        for (int kat = 1; kat <= boyut; kat++) {
            for (int daire = 1; daire <= kat; daire++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int kat = boyut - 1; kat >= 1; kat--) {
            for (int daire = 1; daire <= kat; daire++) {
                System.out.print("*\t");
            }
            System.out.println();
        }















    }
}
