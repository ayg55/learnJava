package j07_StringManipulation;

public class C11_Equals_EqualsIgnoreCase {

    /* equals()
     * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
     *
     *  equals() method'u verilen iki String'in içeriğinin birbirine eşit olup olmadığını kontrol eder.
     * == karşılaştırma operatörü ise verilen iki String objesinin değerinin yanında reference(adres)'lerine de bakar.
     * Aynı değere sahip olsa da farklı iki objeyi == ile karşılaştırdığımızda sonuç FALSE olur.

     * equalsIgnorecase()
     * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
     */

    public static void main(String[] args) {

        String str1 = "Enes";
        String str2 = "enes";

        System.out.println("str1.equals(str2) = " + str1.equals(str2)); //// false
        System.out.println("str2.equals(str1) = " + str2.equals(str1)); // false
        System.out.println("str1.equals(\"Enes\") = " + str1.equals("Enes")); // true
        System.out.println("str1.equalsIgnoreCase(str2) = " + str1.equalsIgnoreCase(str2)); //true

        String str3 = "Sema"; //
        String str4 = "Sema"; // String pool (ayni referans degere tanimlama yapiyor -> yani adres ayni oluyor)
        String str5 = new String("Sema"); //
        String str6 = new String("Sema"); //String data type unique bir referans(adres) deger atiyor

        System.out.println(str3 == str4); // true
        System.out.println(str3.equals(str4)); // true
        System.out.println(str3 == str5); // false
        System.out.println(str5 == str6); // false
        System.out.println(str3.equals(str5)); // true
        System.out.println(str3.equals(str6)); // true

        String sa = "Saim";
        String sb = "";
        sb = sa + "";

        System.out.println("sa = " + sa);
        System.out.println("sb = " + sb);
        System.out.println(sa == sb);
        System.out.println(sa.equals(sb));






    }
}
