package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {

    public static void main(String[] args) {

        /*
        TASK :
        Girilen bir pozitif tamsayı  4 basamaklı ise  "4 Basamaklı"
        degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı"
        degilse "4 basamaklı olmayan tek sayı"  print eden code create ediniz.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");
        int sayi = Math.abs(scan.nextInt());

        System.out.println(sayi > 999 && sayi < 10000 ? sayi + " sayisi 4 basamakli" :
                (sayi % 2 == 0 ? sayi + " sayisi 4 basamakli olmayan Cift sayi" : sayi + " sayisi 4 basamakli olmayan tek sayi"));

    }
}
