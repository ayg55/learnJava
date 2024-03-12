package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "javaTAR" print eden code create ediniz.
        do-while lopp
       */

        Scanner scan = new Scanner(System.in);

        char input;
        do {
            System.out.println("bir karakter girin. islemi bitirmek icin x karakterini girin.");
            input = scan.next().charAt(0);
            if (input != 'x') {
                System.out.println("javaCAN");
            }
        } while (input != 'x');
        System.out.println("javaTAR");


    }
}
