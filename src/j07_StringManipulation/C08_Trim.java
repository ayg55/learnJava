package j07_StringManipulation;

public class C08_Trim {

    /*
       trim()-> İstediğimiz String'in başında veya sonunda varolan boşluk (space)'leri temizler.

       */

    public static void main(String[] args) {

        String str = "  merhaba  hosgeldiniz      ";
        System.out.println("str = " + str);
        System.out.println("str.length() = " + str.length());
        System.out.println("str.trim() = " + str.trim());
        System.out.println("str.trim().length() = " + str.trim().length());

        System.out.println("str = " + str); // str atama yapilmadigi icin degisme olmadi



    }

}
