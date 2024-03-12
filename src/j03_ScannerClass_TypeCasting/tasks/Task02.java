package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen boyunuzu cm olarak giriniz : ");
        int boy=scan.nextInt();
        System.out.println("Lutfen kilonuzu kg olarak giriniz : ");
        double agirlik=scan.nextDouble();
        double vke=(agirlik/(boy*0.01*boy*0.01));
        int vkeI= (int) vke;
        System.out.println("Vucut kitle endeksiniz :  = " + vke);
        System.out.println("Vucut kitle endeksiniz :  = " + vkeI);





    }
}
