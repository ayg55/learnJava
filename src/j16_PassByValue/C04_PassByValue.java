package j16_PassByValue;

public class C04_PassByValue {
    static double etiketFiyati; // gokteki gunes variable -> Class level her meth erisimi olan int type variable tanimlandi.
    static double indirimOrani; // gokteki gunes variable -> Class level her meth erisimi olan int type variable tanimlandi.
    public static void main(String[] args) {
        etiketFiyati = 100;
        indirimOrani = 0.1;
        System.out.println("Indirim oncesi etiket fiyati : " + etiketFiyati);
        indirim();
        System.out.println("Indirim sonrasi etiket fiyati : " + etiketFiyati);
    }

    private static void indirim() {
        etiketFiyati *= (1 - indirimOrani); // gunes variable 0.9 ile carpildi.kalici makyaz yapildi.
        System.out.println("indirilmis etiket fiyati : "+ etiketFiyati);
    }
}
