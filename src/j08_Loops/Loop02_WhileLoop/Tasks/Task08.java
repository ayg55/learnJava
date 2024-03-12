package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // task-> girilen şifrenin asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreTekrar = true;

        while (sifreTekrar) {
            System.out.println("Sifrenizi giriniz : ");
            sifre = scan.nextLine();
            if (sifreKontrol(sifre)) {
                System.out.println("sifre basariyla kaydedildi");
                sifreTekrar = false;
            } 
        }
















    }

    private static boolean sifreKontrol(String sifre) {
        int flag = 0;
        //ilk kareakter kucuk olmali kontrolu
        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z' )) {
            System.out.println("ilk karakter kucuk harf olmali");
            flag++;
        }
        //son karakter rakam olmali kontrolu
        //if ((sifre.charAt(sifre.length(-1)) >= '0' && sifre.charAt(0) <= '9'))
        if (!(Character.isDigit(sifre.charAt(sifre.length() - 1 )))) {
            System.out.println("son karakter rakam olmali");
            flag++;
        }
        //sifre bosluk icermemeli kontrolu
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }
        //sifre uzunluk en az 10 karakter olmali kontrolu
        if (!(sifre.length() >= 10)) {
            System.out.println("sifre en az 10 karakter icermeli");
        }

        return flag == 0;
    }
}
