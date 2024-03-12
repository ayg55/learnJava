package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task09 {


    /*Task->
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayak sayısını print eden code create ediniz.

     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Ciftlikteki inek sayisini giriniz : ");
        int inek= scan.nextInt();
        System.out.println("Ciftlikteki koyun sayisini giriniz : ");
        int koyun= scan.nextInt();
        System.out.println("Ciftlikteki tavuk sayisini giriniz : ");
        int tavuk= scan.nextInt();

        System.out.println("Toplam ayak sayisi = "+(((inek+koyun)*2+tavuk)*2));



    }

}
