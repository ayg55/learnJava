package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task14_again {

            /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
         */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz : ");
        String gender = scan.next();


        if (gender.equalsIgnoreCase("erkek")) {
            System.out.println("Lutfen yasinizi giriniz : ");
            int age = scan.nextInt();
            System.out.println("Lutfen prim gununuzu giriniz : ");
            int prim = scan.nextInt();
            if (age >= 65) {
                if (prim >= 7000) {
                    System.out.println("Emekli olabilirsiniz.");
                } else
                    System.out.println("Emekli olmaniz icin yasiniz yeterli fakat" + (7000 - prim) + " prim gununuz daha var.");
            } else
                System.out.println("Emekli almaniz icin; gerekli yasa " + (65 - age) + " yil, gerekli prime " + (7000 - prim) + " gun daha priminiz var");
        } else if (gender.equalsIgnoreCase("kadin")) {
            System.out.println("Lutfen yasinizi giriniz : ");
            int age = scan.nextInt();
            System.out.println("Lutfen prim gununuzu giriniz : ");
            int prim = scan.nextInt();
            if (age >= 65) {
                if (prim >= 7000) {
                    System.out.println("Emekli olabilirsiniz.");
                } else
                    System.out.println("Emekli olmaniz icin yasiniz yeterli fakat" + (7000 - prim) + " prim gununuz daha var.");
            } else
                System.out.println("Emekli almaniz icin; gerekli yasa " + (65 - age) + " yil, gerekli prime " + (7000 - prim) + " gun daha priminiz var");
        } else System.out.println("Hatali giris yaptiniz");




    }
}
