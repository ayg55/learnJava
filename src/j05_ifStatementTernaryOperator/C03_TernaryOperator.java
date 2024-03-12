package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {

    /*
Ternary ile yapılan tum actionlar if-else blok ile de yapılır.
Ternary blok code daha clean daha okunabilir ve anlaşılabilir olması için tercih edilir.
Ternary blok içinde komplex code yerine daha basic ve doğrudan sonuç üreten code'lar bulunur.
 */

    public static void main(String[] args) {

        int n1 = 21;
        int n2 = 43;

        String sonuc = (n1 > n2) ? "n1 buyuk" : "n2 buyuk";
        System.out.println("sonuc = " + sonuc);

        // Task01-> girilen bir tamsayının  tek-çift olmasını kontrol eden code create ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayi giriniz : ");
        int number1 = scan.nextInt();

        if (number1 % 2 == 0) {
            System.out.println(number1 + " sayisi CIFTTIR");
        } else {
            System.out.println(number1 + " sayisi TEKTIR");
        }

        // ya da


        String result = number1 % 2 == 0 ? number1 + " sayisi CIFTTIR" : number1 + " sayisi TEKTIR";

        System.out.println(result);

        // condition(şart)  ? (if-ise) sart True için ACTION-> if body : (else-değilse) sart False için ACTION -> else body;

        //burda degisken almak gerek yok, result degiskenini bir kez kullancagiz , bunu direk sout un icine atalim .

        System.out.println(number1 % 2 == 0 ? number1 + " sayisi CIFTTIR" : number1 + " sayisi TEKTIR");

        // Task02-> girilen bir tamsayının  pozitif olmasını kontrol eden code create ediniz.

        System.out.println(number1 > 0 ? "Pozitif" : "Negatif");

        // Task03-> girilen iki tamsayının buyugunu print eden code create ediniz.

        System.out.println("Lutfen 1. sayiyi giriniz : ");
        int num1 = scan.nextInt();
        System.out.println("Lutfen 2. sayiyi giriniz : ");
        int num2 = scan.nextInt();

        System.out.println(num1 > num2 ? "Sayi 1 buyuktur : " + num1 : "Sayi 2 buyuktur : " + num2);


        /*
        ahan da trick köşesinde böğünn : ternary operator action sonucu true veya false  agöre verecği output(çıktı) eğer
        data type uygun bir variable(container->kutu) a atnamzsa CTE verir.
        Çözüm olarak teranry çıktısı ya bir variable atanmalaı yada sout gibi doğrudan bir action'da kullanılmalı
        */

        // Task04-> girilen iki tamsayının işaretleri farklı ise toplamını değilse "agam DEWAMKEEE" print eden code create ediniz.

        Object result2 = num1 * num2 < 0 ? num1 +num2 : "Agam DEVAMKEEE";
        System.out.println("result2 = " + result2);

        // object hz adem gibi hepsinin kokeni en tepe class, hz adem class i. onun tipi yoktur hepsinin atasidir, her tipi kabul eder.
        // object her zaman kullanmak mantikli degil cunku islemi yavaslatir. eger baska herhangibir type ile yapilabilirse daha iyi o.
        //hap bilgi -> Ternary ciktisi farkli data type'lardan(int,String,boolean vb) tanimlanmissa
        //tum data type atasi olan Hz.Adem classina(Object) atanir


    }
}
