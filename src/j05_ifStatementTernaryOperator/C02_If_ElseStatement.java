package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C02_If_ElseStatement {

    // task-> girilen yasın 18 den buyulugunu kontrol eden code create ediniz..

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir yas giriniz");
        int age=scan.nextInt();

        if (age>18) {
            System.out.println("Girilen yas 18 den buyuktur.");
        } else System.out.println("Buyu de gel"); // genelde suslu parantezin bitimine yazilir. if in devamliligini gostermesi acisindan



    }
}
