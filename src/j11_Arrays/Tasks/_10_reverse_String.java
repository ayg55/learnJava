package j11_Arrays.Tasks;

import java.util.Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
        Trick-> String split ile arraya atanmalı
         */

        String newText = "";
        String text = "Hello World";
        String[] arrText = text.split("");
        for (int i = arrText.length - 1; i >= 0; i--) {
            newText += arrText[i];
        }
        System.out.println("newText = " + newText);


    }
}