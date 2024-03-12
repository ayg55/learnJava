package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*Task->
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("1. vize notunuzu giriniz : ");
        double midTerm1=scan.nextDouble();
        System.out.println("2. vize notunuzu giriniz : ");
        double midTerm2=scan.nextDouble();
        System.out.println("Final notunuzu giriniz : ");
        double final1=scan.nextDouble();

        System.out.println("Gecme notu = "+(midTerm1*0.15+midTerm2*0.15+final1*0.7));



    }
}
