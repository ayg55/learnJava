package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {
        // task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
        // ornek : Haluk  output: HaLuK

        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String text = scan.nextLine().toLowerCase();
        String newText = "";

        for (int i = 0 ; i < text.length() ; i++) {
            if (i % 2 == 0) {
                newText += String.valueOf(text.charAt(i)).toUpperCase();

            }else newText += text.charAt(i);
        }
        System.out.println("newText = " + newText);


    }
}
