package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int number = scan.nextInt();
        System.out.println("bir sayi daha giriniz");
        int number2 = scan.nextInt();

        int i = number > number2 ? number2 : number;

        while (i < (number2 < number ? number : number2)) {
            System.out.print(i + "\t");
            i++;
        }

        for (int j = (number > number2 ? number2 : number); j < (number2 < number ? number : number2); j++) {
            System.out.print(j + "\t");
        }









    }
}
