package j06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir ay numarası giriniz: ");
        int month = scan.nextInt();

        switch (month) {
            case 1, 2, 12 -> System.out.println("Girilen ay kış mevsimine aittir.");
            case 3, 4, 5 -> System.out.println("Girilen ay ilkbahar mevsimine aittir.");
            case 6, 7, 8 -> System.out.println("Girilen ay yaz mevsimine aittir.");
            case 9, 10, 11 -> System.out.println("Girilen ay sonbahar mevsimine aittir.");
            default -> System.out.println("Geçersiz ay numarası.");
        }

        switch (month) {
            case 1, 2, 12 :
                System.out.println("Girilen ay kış mevsimine aittir.");
                break;
            case 3, 4, 5 :
                System.out.println("Girilen ay ilkbahar mevsimine aittir.");
                break;
            case 6, 7, 8 :
                System.out.println("Girilen ay yaz mevsimine aittir.");
                break;
            case 9, 10, 11 :
                System.out.println("Girilen ay sonbahar mevsimine aittir.");
                break;
            default :
                System.out.println("Geçersiz ay numarası.");
                break;

        }

    }
}
