package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir en az 3 basamakli sayi giriniz : ");
        Integer number = scan.nextInt();
        String[] arr = Integer.toString(number).split("");

        String reversedText = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedText += i;
        }

        System.out.println(reversedText);










    }
}


