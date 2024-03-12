package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {

    public static void main(String[] args) {

        // Task -> girilen bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir sayi giriniz");
        int sayi1= scan.nextInt();

        System.out.println(sayi1<10 && sayi1>-10?sayi1+" sayisi bir basamakli"
                :sayi1+" sayisi 2 veya daha fazla basamakli");

    }
}
