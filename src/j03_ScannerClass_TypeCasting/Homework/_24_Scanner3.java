package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*   Bir String oluşturun.
          Konsol'a sevdiğiniz bir meyveyi yazın.
          O meyveyi yazdırınız.   */

        //Kodu aşağıya  yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Sevdiginiz meyvenin adini yaziniz : ");
        String meyve=scan.nextLine();
        System.out.println("meyve = " + meyve);


    }
}
