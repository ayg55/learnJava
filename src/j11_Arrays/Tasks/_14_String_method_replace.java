package j11_Arrays.Tasks;

import java.util.Arrays;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */

        String text = "Hello World";
//        String[] arr = new String[]{text.replaceAll("o","K")};
//        System.out.println(Arrays.toString(arr));
        String newText = text.replaceAll("o","k");
        System.out.println(newText);


    }
}