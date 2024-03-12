package j05_ifStatementTernaryOperator.alistirmalar;

import java.util.Scanner;

public class a2 {

    //Kullanıcıdan iki sayı alın. Büyük olan sayıyı ekrana yazdırın.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("1. sayiyi giriniz : ");
        int number1=scan.nextInt();
        System.out.println("2. sayiyi giriniz : ");
        int number2=scan.nextInt();

        if (number1>number2){
            System.out.println(number1);
        }else if (number1<number2){
            System.out.println(number2);
        }else System.out.println("sayilar esittir.");

    }
}
