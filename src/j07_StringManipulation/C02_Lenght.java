package j07_StringManipulation;

public class C02_Lenght {

    /*
length() methodu girilen string'in uzunluğunu:içinde bulunan karakter sayısını return(döndurur :verir ) eder
butun karakterleri(boşluk vs) sayıp adedini verir.
 */

    public static void main(String[] args) {

        String str1 = "Hayattan bir saat calmak : ";
        System.out.println("str1.length() = " + str1.length());
        String str2 = " "; // tek binali arsa
        String str3 = ""; //Bos arsa -> Hiclik
        String str4 = null; // Dutluk

        System.out.println("str2.length() = " + str2.length());
        System.out.println("str3.length() = " + str3.length());
        //System.out.println("str4.length() = " + str4.length()); //RTE  -> para var ama ekmek yok, tum sinifinizin calismasini engeller
                                                                  //CTE -> hic para yok, tum projenizin calismasini engeller
        System.out.println("Geldin mi sozume");
        /*
        Hap Bilgi -> null atanan String variable herhangi bir method call etmez
        null -> case sensitive Null != null
         */
        String str5; // Tanimlanmis ama deger atanmamis bos varialbe kutu
        //System.out.println("str5 = " + str5); Cte -> deger atanmamis variable hic bir aksiyona tabi tutulamaz


    }
}
