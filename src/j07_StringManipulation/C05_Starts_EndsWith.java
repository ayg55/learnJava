package j07_StringManipulation;

import java.util.Scanner;

public class C05_Starts_EndsWith {

    /*
 startsWith()
 Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 String'in basladigi characteri dogrular
 endsWith()
 Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
*/

    public static void main(String[] args) {

        String str1 = "ebikGabik";
        System.out.println("str1 = " + str1);
        //str1.startsWith('e'); //CTE parametre olarak char almaz
        System.out.println("str1.startsWith(\"e\") = " + str1.startsWith("e"));
        String str2 = "ebik";
        System.out.println("str1.startsWith(str2) = " + str1.startsWith(str2)); // true
        System.out.println("str2.startsWith(str1) = " + str2.startsWith(str1)); // false
        System.out.println("str2.startsWith(str2) = " + str2.startsWith(str2)); //true

        System.out.println("str2.endsWith(str2) = " + str2.endsWith(str2)); //true
        System.out.println("str1.startsWith(\"k\",3) = " + str1.startsWith("k", 3));

        //Task-> girilen e-mail hesabının  @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("E-mail adresinizi giriniz : ");
        String eMail = scan.next();
        if (eMail.endsWith("@gmail.com") == true) {
            System.out.println("hesabiniz onaylandi");
        }else System.out.println("Lutfen gmail hesabi giriniz");

    }
}
