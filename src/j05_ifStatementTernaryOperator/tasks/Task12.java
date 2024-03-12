package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        /*
          TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz : ");
        char character = scan.next().charAt(0);

        if (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z')
            System.out.println("Bu bir harf");
        else System.out.println("Bu bir harf degildir");
    }
}
