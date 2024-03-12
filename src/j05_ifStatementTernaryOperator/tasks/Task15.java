package j05_ifStatementTernaryOperator.tasks;

import java.beans.EventHandler;
import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Ehliyeti var mi?(true yada false girin) : ");
        String userInput = scan.nextLine();
        boolean isDriverLicenceAvaible = Boolean.parseBoolean(userInput);

        System.out.println("Kac yil soforluk tecrusi var : ");
        int experiance = scan.nextInt();

        System.out.println("Bugune kadar toplan kac km yol yapti : ");
        int distance = scan.nextInt();

        if (isDriverLicenceAvaible == true && experiance >= 7 && distance >= 100000) {
            System.out.println("Kontak anahtarini veriniz");
        } else if (isDriverLicenceAvaible == true && experiance >= 7) {
            System.out.println((100000 - distance) + " mesafe daha yapmaniz gerekiyor");
        } else if (isDriverLicenceAvaible == true && distance >= 100000) {
            System.out.println((7 - experiance) + " yil daha tecrubeniz olmalidir.");
        } else if (isDriverLicenceAvaible == true) {
            System.out.println((100000 - distance) + " mesafe daha yapmaniz ve " + (7 - experiance) + " yil daha tecrubeniz olmasi gerekiyor.");
        } else System.out.println("ehliyetsiz arac kullanimi");


    }
}





















