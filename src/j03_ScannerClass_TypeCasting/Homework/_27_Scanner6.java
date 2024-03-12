package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

    /*    Bir string oluşturunuz.
          Doğum gününüzü konsola giriniz.
          String'i yazdırınız.  */

        //kodu aşağıya yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("dogum gununuzu giriniz (gg.aa.yyyy) : ");
        String dogumG=scan.nextLine();
        System.out.println("dogumG = " + dogumG);



    }
}
