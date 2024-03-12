package j07_StringManipulation;

import java.util.Scanner;

public class C03_CharAt {

    /*
charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
Çoooğğğ önemli ->  index değeri her zaman 0'dan başlar.-> ucağın koltuk nosu 0'dan başlar
 */

    public static void main(String[] args) {

        String qa = "Saim Team Lead";
        System.out.println("qa = " + qa);
        System.out.println("qa.charAt(5) = " + qa.charAt(5)); //T
        char yedinciKarakter = qa.charAt(7);
        System.out.println("yedinciKarakter = " + yedinciKarakter); //a
        //son karakter indexi = str.length()-1
        //metnimizin uzunlugundan fazla bir index girersek java bize RTE hatasi verir. -> StringIndexOutOfBoundsException

        //task-> Girilen bir String ifadenin ortadaki karakterini print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz : ");
        String metin = scan.nextLine();
        if (metin.length() % 2 == 0){
            System.out.println("Girilen metnin ortasi yoktur");
        }else System.out.println(metin.charAt(metin.length()/2));



















    }
}
