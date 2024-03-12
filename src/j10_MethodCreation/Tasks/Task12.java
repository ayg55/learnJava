package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task12 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> girilen meyılın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
        1- @ karakteri olmalı
        2- . (nokta) karakteri olmalı
        3- @ karakterinden önce mutlaka en az bir karakter olmalı.
        Example:
        "@gmail.com"-> false
        "@gmailcom"-> false
        "gmail.com"-> false
        "ebıkGabık@gmail.com"-> true
         */

        System.out.println(emailControl(emailGiris()));


    }//main sonu

    private static boolean emailControl(String email) {
        return email.contains("@") && email.contains(".") && !email.startsWith("@");
    }

    public static String emailGiris() {
        System.out.println("lutfen emailinizi giriniz ; ");
        return input.next();
    }


}//Class sonu
