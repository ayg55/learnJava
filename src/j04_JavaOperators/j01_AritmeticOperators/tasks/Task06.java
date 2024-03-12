package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*Task->
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */



        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli bir sayi yaziniz. : ");
        int number=scan.nextInt();

        System.out.println(" Girdiginiz sayinin birler basamagi : "+(number%10)+" Girdiginiz sayinin onlar basamagi : "+((number/10)%10)+" Girdiginiz sayinin yuzler basamagi : "+(number/100));


    }
}
