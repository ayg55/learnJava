package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {


        /* Task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         *
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir character giriniz. : ");
        char ch=scan.next().charAt(0);
        int deger=(int) ch;

        System.out.println("Girdiginiz "+ch+" karakterinin ascii degeri : "+deger );



    }


}
