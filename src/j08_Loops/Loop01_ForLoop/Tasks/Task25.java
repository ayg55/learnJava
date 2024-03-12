package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task25 {

    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden code create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String text = scan.nextLine();
        String newString = "";

        for (int i = 0; i < text.length(); i++) {
            if (!(newString.contains(String.valueOf(text.charAt(i))))) newString += text.charAt(i);
        }
        System.out.println(newString);



    }
}
