package j07_StringManipulation;

public class C13_ValueOf_Parse {

    /*
 Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
 Stringlerle matematiksel islemler yapabilmemizi saglar.

valueOf(); meth hem Integer wrapper  hem de String Class'da bulunur. Integer wrapper Class
 valueOf() methdou String'i integer'a  String Class valueOf() methodu integer'i String'e cevirir.
 */

    public static void main(String[] args) {

        // task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz.

        String b1 = "10000";
        String b2 = "12000";

        System.out.println("(b1 + b2) = " + (b1 + b2));
        
        int yeniB1 = Integer.valueOf(b1);
        int yeniB2 = Integer.valueOf(b2);
        System.out.println("(yeniB1 + yeniB2) = " + (yeniB1 + yeniB2));

        /*
        Task-> String strA="$13.99"  String strB="$17.55" parse method kullanarak strA+strB toplamını print den code create ediniz
        output: strA+strB=31.54
                */

        String strA="$13.99";
        String strB="$17.55";

       //int yeniA = Integer.valueOf(strA); //RTE -> dolar isareti var.

        double yeniA = Double.parseDouble(strA.substring(1));
        double yeniB = Double.parseDouble(strB.substring(1));

        System.out.println(yeniA + yeniB);




    }

}
