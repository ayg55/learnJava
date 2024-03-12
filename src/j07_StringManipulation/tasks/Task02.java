package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz : ");
        String password = scan.nextLine();
        if (Character.isUpperCase(password.charAt(0)) == true) {
            if (Character.isDigit(password.charAt(password.length() - 1)) == true) {
                if (password.length() >= 6) {
                    System.out.println("Sifre basariyla olusturuldu");
                } else System.out.println("en az 6 karakter olmali");
            } else System.out.println("Son karakter sayi olmali");
        } else System.out.println("Ilk harf buyuk olmali");


    }
}
