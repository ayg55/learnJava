package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task18 {
    /* Koç Burcu : 21 Mart - 20 Nisan
       Boğa Burcu : 21 Nisan - 21 Mayıs
       İkizler Burcu : 22 Mayıs - 22 Haziran
       Yengeç Burcu : 23 Haziran - 22 Temmuz
       Aslan Burcu : 23 Temmuz - 22 Ağustos
       Başak Burcu : 23 Ağustos - 22 Eylül
       Terazi Burcu : 23 Eylül - 22 Ekim
       Akrep Burcu : 23 Ekim - 21 Kasım
       Yay Burcu : 22 Kasım - 21 Aralık
       Oğlak Burcu : 22 Aralık - 21 Ocak
       Kova Burcu : 22 Ocak - 19 Şubat
       Balık Burcu : 20 Şubat - 20 Mart

       switch-case kullanmadan yapınız. */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen ay giriniz : ");
        String month = scan.next();
        String months = month.toLowerCase();
        System.out.println("Lutfen gunu rakam olarak giriniz : ");
        int day = scan.nextInt();

        if ((months == "mart" && day >= 21) || (months == "nisan" && day <= 20)) {
            System.out.println("Koc Burcu");
        }
        if ((months == "nisan" && day >= 21) || (months == "mayis" && day <= 21)) {
            System.out.println("Boga Burcu");
        }
        if ((months == "mayis" && day >= 22) || (months == "haziran" && day <= 22)) {
            System.out.println("Ikizer Burcu");
        }
        if ((months == "haziran" && day >= 23) || (months == "temmuz" && day <= 22)) {
            System.out.println("Yengec Burcu");
        }
        if ((months == "temmuz" && day >= 23) || (months == "agustos" && day <= 22)) {
            System.out.println("Aslan Burcu");
        }
        if ((months == "agustos" && day >= 23) || (months == "eylul" && day <= 22)) {
            System.out.println("Basak Burcu");
        }
        if ((months == "eylul" && day >= 23) || (months == "ekim" && day <= 22)) {
            System.out.println("Terazi Burcu");
        }
        if ((months == "ekim" && day >= 23) || (months == "kasim" && day <= 21)) {
            System.out.println("Akrep Burcu");
        }
        if ((months == "kasim" && day >= 22) || (months == "aralik" && day <= 21)) {
            System.out.println("Yay Burcu");
        }
        if ((months == "aralik" && day >= 22) || (months == "ocak" && day <= 21)) {
            System.out.println("Oglak Burcu");
        }
        if ((months == "ocak" && day >= 22) || (months == "subat" && day <= 19)) {
            System.out.println("Kova Burcu");
        }
        if ((months == "subat" && day >= 20) || (months == "mart" && day <= 20)) {
            System.out.println("Balik Burcu");
        }

    }
}
