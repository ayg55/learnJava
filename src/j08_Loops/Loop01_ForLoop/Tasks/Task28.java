package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {

        // task-> girilen  bir char karakterden sonra gelen 10 karakteri print eden code create ediniz

        Scanner scan = new Scanner(System.in);

       char karakter = scan.next().charAt(0);

        for (int i = 1 ; i < 11 ; i++) {
            char nextChar = (char)(karakter + i);
            System.out.print(" " + nextChar);
        }


    }
}
