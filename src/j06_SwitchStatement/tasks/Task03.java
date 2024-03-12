package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task-> Girilen hafta gün sayısına karşılık gelen gün adını print eden code create ediniz.
        // 1.gün Pazartesi olsun

        Scanner scan = new Scanner(System.in);

        System.out.println("Haftanin kacinci gununun adini ogrenmek istiyorsunuz? : ");
        int day = scan.nextInt();

        switch (day) {
            case 1 -> System.out.println("pazartesi");
            case 2 -> System.out.println("sali");
            case 3 -> System.out.println("carsamba");
            case 4 -> System.out.println("persembe");
            case 5 -> System.out.println("cuma");
            case 6 -> System.out.println("cumartesi");
            case 7 -> System.out.println("pazar");
            default -> System.out.println("hatali giris");
        }


    }
}
