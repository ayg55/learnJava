package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task22 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Girilen  string icinde en cok tekrar eden karakteri print eden code create ediniz.
       input : JavaCAN'lara selam olsun
       output: maximumCounts occurring character is : a
        */

        System.out.print("agam bir metin gir : ");
        String input = scan.nextLine().toLowerCase().replaceAll(" ", "");
        String maximumCountsCharacter = maximumCounts(input);
        System.out.println(maximumCountsCharacter);

    }

    private static String maximumCounts(String string) {
        String[] text = string.split("");
        int counter = 0, result = 0;
        String character = "";
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text.length; j++) {
                if (text[i] == text[j]) {
                    counter++;
                    if (counter > result) {
                        result = counter;
                        character = text[i];
                    }
                }
            }
        }
        return character;
    }
}

