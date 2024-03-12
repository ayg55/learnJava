package j08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

    public static void main(String[] args) {

        /*
      Başlangıç bitiş ve değişim değerleri net  bilinen tekrarlarda for loop ama adım sayısı değişim değeri
      net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlarda while loop kullanılır.
       */

        //Task01-> 3'den 20'ye kadar olan tamsayıları print eden code create ediniz.

        for (int i = 3; i < 21; i++) {
            System.out.println(i);
        }

        int i = 3; //while loop un baslangic degeri tanimlandi
        while (i <= 20){ //i 20 den kucuk oldugu muddetce devam edecek
            System.out.println(i);
            i++; // while loop sarti icin degisim komutu tanimlandi
        }

        // task02-> 7 kere javaCAN print eden code create ediniz

        for (int j = 0; j < 7; j++) {
            System.out.println(j + " javaCAN");
        }
        int j = 0;
        while (j < 7) {
            System.out.println(j + " javaCAN");
            j++;
        }
        // task03->2 basamaklı tek sayıları print eden code create ediniz
        int t = 11;
        while (t < 100) {
            System.out.print(t + " ");
            t+=2;
        }
        System.out.println();

        // task04->girilen ifadeyi tersten  print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin = scan.nextLine();

        int harfSayisi = metin.length();

        while (harfSayisi > 0) {
            System.out.print(metin.charAt(harfSayisi - 1));
            harfSayisi --;
        }

        System.out.println();
        // task05->girilen pozitif  tamsayıya kadar pozitif sayıların toplamını  print eden code create ediniz

        System.out.println("Pozitif bir sayi giriniz");
        int sayi2 = scan.nextInt();
        int toplam = 0;
        int x = 1;
        while (x <= sayi2) {
            toplam += x;
            x++;
        }
        System.out.println(toplam);

        // task07->girilen tamsayının faktöriyelini  print eden code create ediniz

        System.out.println("Faktoriyelini hesaplamak istediginiz sayiyi giriniz : ");
        int sayi3 = scan.nextInt();
        int factoriyel = 1;

        while (sayi3 > 1) {
            factoriyel *= sayi3;
            sayi3 --;
        }
        System.out.println("factoriyel = " + factoriyel);







    }



}
