package j05_ifStatementTernaryOperator.tasks;


import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

        /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir sayi giriniz");
        int num1=scan.nextInt();

        if (num1<0) System.out.println(num1+" sayisi NEGATIFTIR");
        else if (num1>0) System.out.println(num1+" sayisi POZITIFTIR");
        else System.out.println(num1+" sayisi NOTR'dur");



    }
}
