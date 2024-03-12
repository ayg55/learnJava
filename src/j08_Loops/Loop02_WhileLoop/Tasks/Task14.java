package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task14 {

    //Task-> Girilen iki sayının EBOB ve EKOK değerlerini "While Döngüsü" prnt eden code create ediniz.

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("1. sayiyi giriniz");
        int number1 = scan.nextInt();
        System.out.println("2. sayiyi giriniz");
        int number2 = scan.nextInt();
        int i = 1;
        int ebob = 1;
        while (i <= Math.min(number2,number1)) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("iki sayinin ebob'u " + ebob + " ekok'u " + (number1 * number2 / ebob));
    }
}
