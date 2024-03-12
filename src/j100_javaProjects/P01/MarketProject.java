package j100_javaProjects.P01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MarketProject { //Class level


    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *            ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *            ortalama kazançtan aşağıysa o günleri return yap.
     * */

    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar")); //1. Adim
    static List<Double> gunlukKazanc = new ArrayList<>(); //2. Adim
    static Scanner input = new Scanner(System.in);
    static double haftaninToplamKAzanci = 0;

    public static void main(String[] args) { //main level

        // 3. Adim
        int gun = 0;
        while (gun < 7) {
            System.out.print("Agam hele " + gunler.get(gun) + " gunun hasilatini giresen : ");
            double gununKazanci = input.nextDouble();
            haftaninToplamKAzanci += gununKazanci; //Loop dan gelen herbir gunun hasilati haftalik toplam kazanca eklendi
            gunlukKazanc.add(gununKazanci); //Loopdan gelen her bir gunun hasilati gunluk kazanc listine sirasiyla eklendi
            gun++;
        }

        System.out.println("getOrtalamaKazanc() = " + getOrtalamaKazanc()); // ?

        System.out.println("getOrtalamaninUstundeKazancGunleri() = " + getOrtalamaninUstundeKazancGunleri());
        System.out.println("getOrtalamaninAltindaKazancGunleri() = " + getOrtalamaninAltindaKazancGunleri());


    } //main level

    private static ArrayList getOrtalamaninAltindaKazancGunleri() {
        ArrayList<String> ortalamaninAltiGunler = new ArrayList<>(); //ortalamayi gecmeyen gunlerin eklenecegi bos list tanimlandi.
        for (int i = 0; i < gunlukKazanc.size(); i++) { // gun sayisi kadar tekrar tanimlandi
            if (gunlukKazanc.get(i) < getOrtalamaKazanc()) { //tekrardan gelen herbir gunun hasilati ortalamadan kucuklugu kontrol edildi
                ortalamaninAltiGunler.add(gunler.get(i)); //ortalamadan kucuk olan gun Liste atandi
            }
        }
        return ortalamaninAltiGunler;

    }

    private static ArrayList<String> getOrtalamaninUstundeKazancGunleri() { //5. Adim
        ArrayList<String> ortalamaninUstuGunler = new ArrayList<>(); //ortalamayi gecen gunlerin eklenecegi bos list tanimlandi.
        for (int i = 0; i < gunlukKazanc.size(); i++) { // gun sayisi kadar tekrar tanimlandi
            if (gunlukKazanc.get(i) > getOrtalamaKazanc()) { //tekrardan gelen herbir gunun hasilati ortalamadan buyuklugu kontrol edildi
                ortalamaninUstuGunler.add(gunler.get(i)); //ortalamadan buyuk olan gun Liste atandi
            }
        }
        return ortalamaninUstuGunler;
    }

    private static double getOrtalamaKazanc() {
        return haftaninToplamKAzanci / 7;
    }


} //Class level
