package j11_Arrays;

import java.util.Arrays;

public class C04_Arrays_Split {

    // String data type dataları Arrays'e elaman olarak cevirmek için split() meth kullanılır.

    public static void main(String[] args) {
        String  str="javaNAZ'lara bolcana selamkeee. taskları çözmeyenin klayveyisi bozulsun ekranı mavi caksın :( ";
        // task-> str'nin kelime ve harf sayısını print eden code create ediniz.
        String [] wordArr = str.split(" ");
        System.out.println("Arrays.toString(wordArr) = " + Arrays.toString(wordArr));
        System.out.println("str nin kelime sayisi : " + wordArr.length);

        String [] letterArr = str.replaceAll("\\W","").split("");
        System.out.println("Arrays.toString(letterArr) = " + Arrays.toString(letterArr));
        System.out.println("str'nin harf sayisi : " + letterArr.length);
        char [] characterArr = str.replaceAll("\\W","").toCharArray();
        System.out.println("Arrays.toString(characterArr) = " + Arrays.toString(characterArr));
    }
}
