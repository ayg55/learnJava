package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Task-> Girilen ay ismine göre   ayin kac cektigini print eden code create ediniz.
		 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir ay giriniz. : ");
        String month = scan.next().toLowerCase();

        switch (month) {
            case "nisan", "haziran", "eylul", "kasim":
                System.out.println("30");
                break;
            case "ocak", "mart", "mayis", "temmuz", "agustos", "ekim", "aralik":
                System.out.println("31");
                break;
            case "subat":
                System.out.println("Lutfen yil giriniz : ");
                int year = scan.nextInt();
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("29");
                } else if (year % 4 != 0) {
                    System.out.println("28");
                } else {
                    System.out.println("hatali giris");
                }
                break;
            default:
                System.out.println("hatali giris");
        }
    }
}
