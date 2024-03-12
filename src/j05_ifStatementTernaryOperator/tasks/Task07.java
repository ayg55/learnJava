package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz : ");
        char character = scan.next().charAt(0);

        if ((character >= 'a' && character <= 'z') && character == 'a') {
            System.out.println("Ilk kucuk harf");
        } else if (character >= 'A' && character <= 'Z') {
            if (character == 'Z') {
                System.out.println("Son buyuk harf");
            } else System.out.println("Son buyuk harf degil");
        } else System.out.println("Ikl kucuk harf degil");
    }
}

