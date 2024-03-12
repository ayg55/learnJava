package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        //Task-> Girilen 3  sayıdan en küçüğünü print eden METHOD  create ediniz

        Scanner scan = new Scanner(System.in);

        System.out.println("1. sayisi giriniz");
        int number1 = scan.nextInt();
        System.out.println("2. sayisi giriniz");
        int number2 = scan.nextInt();
        System.out.println("3. sayisi giriniz");
        int number3 = scan.nextInt();

        System.out.println(minNumber(number1, number2, number3));


    }//main sonu

    private static int minNumber(int number1, int number2, int number3) {
        //System.out.println(Math.min(number1, (Math.min(number2, number3))));
        return Math.min(number1, (Math.min(number2,number3)));
    }

}//Class sonu
