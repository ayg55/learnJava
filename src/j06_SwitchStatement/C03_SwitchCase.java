package j06_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {

    public static void main(String[] args) {

        // Task-> Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir ay numarasi giriniz : ");
        int month = scan.nextInt();

        switch (month) {
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("Girilen ayda 31 gun vardir.");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("Girilen ayda 30 gun vardir.");
            case 2 :
                System.out.println("Hangi yil icin soruyorsunuz");
                int yil = scan.nextInt();
                if (yil % 4 == 0) {
                    if (yil % 100 != 0 || yil % 400 == 0) {
                        System.out.println("Girilen ayda 29 gun vardir");
                    }else {
                        System.out.println("Girilen ayda 28 gun vardir");
                    }
                    break;
                }else {
                    System.out.println("Girilen ayda 28 gun vardir");
                }
            default:
                System.out.println("Hatali giris");





        }

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Girilen ayda 31 gün vardır.");
            case 4, 6, 9, 11 -> System.out.println("Girilen ayda 30 gün vardır.");
            case 2 -> {
                System.out.print("Lütfen bir yıl girin: ");
                int yil2 = scan.nextInt();
                if (yil2 % 4 == 0 && (yil2 % 100 != 0 || yil2 % 400 == 0)) {
                    System.out.println("Girilen ayda 29 gün vardır.");
                } else {
                    System.out.println("Girilen ayda 28 gün vardır.");
                }
            }
            default -> System.out.println("Hatali giris");
        }

    }
}
