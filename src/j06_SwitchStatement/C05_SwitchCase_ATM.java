package j06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase_ATM {

    public static void main(String[] args) {

        /*
        TaskATM-> Bakıye 1000$ olan bir banka hesabı için bakıye öğrenme-para çekme-para yatırma
        ve çıkış işlemlerinin yapıldığı bir ATM app. create ediniz.
        */

        Scanner scan = new Scanner(System.in);
        int bakiye = 1000;

        System.out.println("Java Bank'a hosgeldiniz");
        System.out.println("Yapmak istediginiz islemin numarasini giriniz. \n1 = bakiye sorgulama \n2 = para cekme \n3 = para yatirma \n4 = cikis");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hesabinda " + bakiye + " $ bakiyen var");
                break;
            case 2:
                System.out.println("Ne kadar para cekmek istiyorsun? : ");
                int cekme = scan.nextInt();
                if (cekme <= bakiye) {
                    bakiye -= cekme;
                    System.out.println("Para cekme islemi basarili");
                } else {
                    System.out.println("Yetersiz bakiye");
                }
                break;
            case 3:
                System.out.println("Ne kadar para yatirmak istiyorsunuz : ");
                int yatirma = scan.nextInt();
                bakiye += yatirma;
                System.out.println("Para yatirma islemi basarili");
                break;
            case 4:
                System.out.println("Cikis yaptiniz.");
                break;
            default:
                System.out.println("Hatali secim tekrar dene");
        }

    }

}
