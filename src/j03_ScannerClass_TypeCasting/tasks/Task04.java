package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isim ve soyisminizi giriniz : ");
        String name=scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz : ");
        int age=scan.nextInt();
        System.out.println("Lutfen kilonuzu giriniz : ");
        int kilo=scan.nextInt();
        System.out.println("Lutfen boyunuzu giriniz (cm olaral) : ");
        int lenght=scan.nextInt();
        System.out.println("Spor salonuna kac ay gitmeyi istiyorsunuz : ");
        int months=scan.nextInt();

        System.out.println("Isim-soyisim : " + name+"\nYas : "+age+"\nKilo : "+kilo+"\nBoy "+lenght+"\n\nToplam odemeniz gereken ucret : $"+(20*months));


    }
}
