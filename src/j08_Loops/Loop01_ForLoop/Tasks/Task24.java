package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {
		/*
		 Task -> girilen  String'in tersini(reverse String) print eden code create ediniz
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String text = scan.nextLine();
        String reverseText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText += text.charAt(i);
        }
        System.out.println(reverseText);





    }

}
