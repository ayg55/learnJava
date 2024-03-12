package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C05_NestedTernaryOperator {

    public static void main(String[] args) {

        /*
        TASK :
        Girilen sayi 0 dan buyuk esit ise 10 dan kucukluğunu kontrol ediniz.
        10 dan kucuk ise  "Rakam" degilse "Pozitif Sayi" ,
        Sayi 0'dan kucuk ise  "Negatif Sayi" print eden code create ediniz
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi = sc.nextInt();

        System.out.println(sayi >= 0 ? (sayi < 10 ? "rakam" : "Pozitif") : "Negatif Sayi");

    }
}
