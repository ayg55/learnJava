package j05_ifStatementTernaryOperator.alistirmalar;

import java.util.Scanner;

public class a1 {
    /*
    Kullanıcıdan bir sayı alın. Eğer sayı pozitif ise "Sayı pozitif", negatif ise "Sayı negatif",
    sıfır ise "Sayı sıfır" yazdırın.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz : ");
        int number = scan.nextInt();
        if (number > 0) {
            System.out.println("Sayi pozitiftir.");
        } else if (number < 0) {
            System.out.println("Sayi negatiftir. ");
        } else System.out.println("sayi sifirdir.");


    }
}
