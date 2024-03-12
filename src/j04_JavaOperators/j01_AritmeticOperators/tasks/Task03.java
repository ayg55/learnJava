package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        /* Task->
         * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Luffen 3 basamakli bir sayi giriniz. : ");
        int number=scan.nextInt();

        System.out.println("Toplam : "+(number%10+number/100));




    }

}
