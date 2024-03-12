package j06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir gun giriniz");
        String day = scan.next().toLowerCase();

        switch (day) {
            case "pazartesi" , "sali" , "carsamba" , "persembe" , "cuma" :
                System.out.println("Girilen gun haftaici");
                break;
            case "cumartesi" , "pazar" :
                System.out.println("Girilen gun haftasonu");
                break;
            default:
                System.out.println("Hatali giris");
        }
        switch (day) {
            case "pazartesi", "sali", "carsamba", "persembe", "cuma" -> System.out.println("Girilen gun haftaici");
            case "cumartesi", "pazar" -> System.out.println("Girilen gun haftasonu");
            default -> System.out.println("Hatali giris");
        }

    }
}
