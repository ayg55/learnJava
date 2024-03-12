package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task36 {

    public static void main(String[] args) {
	//  Java ile girilen sayının harmonik serisini bulan program yazacağız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int number = scan.nextInt();
        double total = 0.0;

        for (int i = 1; i <= number; i++) {
            total += 1.0 / i;
        }
        System.out.println("total = " + total);

    }
}
