package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/* Task->
		 Girilen bir sayı için
		 sayi 3 basamakli ise console ' a "3 basamakli"
		 sayi 2 basamakli ise console'a "2 basamakli"
		 sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
		 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz : ");
        int number = scan.nextInt();

        if (number <= 999 && number >= 99) {
            System.out.println(number + " 3 basamakli");
        } else if (number <= 99 && number >= 9) {
            System.out.println(number + " 2 basamakli");
        } else {
            System.out.println("ikisi de degil");
        }


    }
}
