package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

        // Scanner nesnesini oluştur
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan 4 tane tamsayı girişi al
        System.out.println("Lütfen 4 tane tamsayı giriniz:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();

        System.out.println("Girilen sayıların toplamı: " + (num1 + num2 + num3 + num4));

    }
}
