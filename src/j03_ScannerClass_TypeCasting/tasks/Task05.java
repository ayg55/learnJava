package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {


        // Task-> kullanicidan 2 tam sayinın  dort islem sonucunu print eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz : ");
        int n1=scan.nextInt();
        System.out.println("Lutfen 2. sayiyi giriniz : ");
        int n2=scan.nextInt();

        System.out.println("Iki sayinin;"+"\n\nToplami : "+(n1+n2)+"\nFarki : "+(n1-n2)+"\nCarpimi : "+(n1*n2)+"\nBolumu : "+(n1/n2));



    }

}
