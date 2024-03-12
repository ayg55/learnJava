package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("bir metin giriniz");
        String str = scan.nextLine();
        System.out.println("bir index numarasi giriniz");
        int index = scan.nextInt();
        if (index <= str.length()) {
            System.out.println(str.charAt(index));
        } else System.out.println("istediginiz index numarasi yoktur");





    }
}
