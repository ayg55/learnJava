package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /* Task->
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
hipotenus=birinciKenar*birinciKenar+ikinciKenar*ikincikenar karekoku
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner scan=new Scanner(System.in);
        System.out.println("Hesaplamak istediginiz ucgenin 1. dik kenarinin olcusunu cm olarak giriniz : ");
        double edge1=scan.nextDouble();
        System.out.println("Ucgenin 2. dik kenarinin olcusunu cm olarak giriniz : ");
        double edge2=scan.nextDouble();
        double h=(edge1*edge1+edge2*edge2);
        System.out.println("Ucgenin hipotenusunun uzunlugu : " + Math.sqrt(h));















    }
}
