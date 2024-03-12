package j100_javaProjects.P01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ManavProject { //Class level

    static ArrayList<String> urunListesi = new ArrayList<>(Arrays.asList("domat->1","balcan->2","fujiElma->3","cilek->4","muz->5"));
    static ArrayList<Double> urunFiyatListesi = new ArrayList<>(Arrays.asList(20.5,35.3,40.2,50.0,85.7));
    static double toplamOdenecekMiktar = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) { //main level

        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */


        System.out.println("Agam marketime hos geldin");

        musteriSecim();


    } // main sonu

    private static void musteriSecim() {
        System.out.println(urunListesi + "\n" + urunFiyatListesi);
        System.out.println("agam hangi urun istersin : ");

        int urunSecim = input.nextInt();

        if (urunSecim < 6 && urunSecim > 0) { // girilen urun kodumu 1,2,3 ..5 kontrolu yapildi.
            System.out.println("Agam sectiginiz urunden kac kilo istersin : ");

            double kilo = input.nextDouble();

            toplamOdenecekMiktar += kilo*urunFiyatListesi.get(urunSecim - 1);

            System.out.println("Agam istediginiz " + kilo +" kilo " + urunListesi.get(urunSecim - 1).replaceAll("[^a-z]", "")
                    + " urununun kilo fiyati " +  urunFiyatListesi.get(urunSecim - 1) + "\n"
                    + "ve toplam odemeniz : " + toplamOdenecekMiktar);

            System.out.println("Agam alisverise DEWAMKEEE icin 1 , KASA icin 2 giresin");

            int karar = input.nextInt();

            if (karar == 1) {
                musteriSecim();
            } else if (karar == 2) {
                kasa();
            } else System.out.println("agam gelmim ora adam gibin bisey giresin");

        }else {
            System.out.println("agam gelmim ora adam gibin bisey giresin");
            musteriSecim();
        }
    }

    private static void kasa() {
        System.out.println("Agam toplam odemeniz gereken tutar : " + toplamOdenecekMiktar + "\n" + "Yine Bekleriz");
    }


} //Class sonu
