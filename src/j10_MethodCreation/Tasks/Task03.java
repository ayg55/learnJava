package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task03 {
    static Scanner scan = new Scanner(System.in); // herkes ulassin diye method ustu class levela tanimlandi
    // -> ststic dernegine uye yapildi

    public static void main(String[] args) {
        //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.

//        Scanner scan = new Scanner(System.in);
//        System.out.println("cevirilecek birimi giriniz -> saat/mil/kg");
//        String birim = scan.next().toLowerCase();
//        System.out.println("cevirilecek birimin miktarini giriniz");
//        double miktar = scan.nextDouble();

        donustur(birimVer(),miktarVer());


    }//main sonu


    private static void donustur(String birim, double miktar) {
        switch (birim) {
            case "saat" :
                saatSaniye(miktar);//System.out.println("girdigin " + miktar + " saatin saniye degeri = " + (miktar * 3600));
                break;
            case "mil" :
                milKm(miktar);//System.out.println("girdigin " + miktar + " mil km degeri = " + (miktar * 1.6));
                break;
            case "kg" :
                kgGr(miktar);//System.out.println("girdigin " + miktar + " kg gr degeri = " + (miktar * 1000));
                break;
            default:
                System.out.println("Hatali birim girdiniz");
        }
    }

    private static void kgGr(double miktar) {
        System.out.println("girdigin " + miktar + " kg gr degeri = " + (miktar * 1000));
    }

    private static void milKm(double miktar) {
        System.out.println("girdigin " + miktar + " mil km degeri = " + (miktar * 1.6));
    }

    private static void saatSaniye(double miktar) {
        System.out.println("girdigin " + miktar + " saatin saniye degeri = " + (miktar * 3600));
    }

    private static String birimVer() {
        System.out.println("cevirilecek birimi giriniz -> saat/mil/kg");
        String birim = scan.next().toLowerCase();
        System.out.println("cevirilecek birimin miktarini giriniz");
        return birim;
    }

    private static double miktarVer() {
        double miktar = scan.nextDouble();
        return miktar;
    }

}// Class sonu
