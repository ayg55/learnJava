package j04_JavaOperators.j01_AritmeticOperators;

public class C03_MathMethods {

    /*
     Math.abs(a)
     Girilen degerin mutlak degerini verir.

    Math.max(a, b)
    Girilen iki degerden buyuk olani verir.

    Math.min(a, b)
    Girilen iki degerden kucuk olani verir.

    Math.round(a)
    Girilen degerin en yakin tamsayiya yuvarlar.

    Math.sqrt(a)
    Girilen degerin karekokunu verir.

    Math.pow(a, b)
    Girilen a ve b degerini a uzeri b olarak verir.

    Math.ceil(a) 3.1 => 4
    Girilen bir ondalikli sayiyi bir sonraki en yakin tam sayiya yukseltir.

    Math.floor(a) 3.7 => 3
    Girilen bir ondalikli sayiyi bir onceki en yakin tam sayiya indirger.
     */

    public static void main(String[] args) {

        //task-> 81'in karekokunu print eden code create ediniz//task-> 81'in karekokunu print eden code create ediniz

        System.out.println(Math.sqrt(81)); //Math class i genellikle double donus yapar.
        System.out.println(Math.abs(-55));

        //Math classi app i yavaslatir if e gore. if ile yapmak daha karli.
        // kullanicidan veri alirken if kullanin mutlak deger icin. ama islem yapilacakdsa math class ini kullanabiliriz.

        System.out.println(Math.max(24,65));
        System.out.println(Math.min(24,65));
        System.out.println(Math.round(19.03));
        System.out.println(Math.round(19.5));
        System.out.println(Math.round(19.57));
        System.out.println(Math.ceil(19.99));
        System.out.println(Math.ceil(19.01));
        System.out.println(Math.floor(19.99));
        System.out.println(Math.floor(19.01));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(-2,4));
        System.out.println(Math.pow(-2,3));
        System.out.println(Math.random());
        int rastgeleSayi= (int) (Math.random()*100);
        System.out.println("rastgeleSayi = " + rastgeleSayi);
        double randomNumber=Math.random()*50;
        System.out.println("randomNumber = " + randomNumber);










    }
}
