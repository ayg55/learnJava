package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // task-> girilen sayının faktöriyelini print code create ediniz
        //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bir sayi giriniz");
        int number = scan.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("faktoriyel = " + factorial);

    }
}
