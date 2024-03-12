package j03_ScannerClass_TypeCasting;

public class C02_TypeCasting {

    /*
       Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirme işlemidir.
                     byte < short < int < long < float < double
       Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
       Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir.
   */

    public static void main(String[] args) {

        boolean basarili=true;
        System.out.println("basarili = " + basarili);
        //String succes=basarili; // dogal uyum olmadigi icin cte veriyor.
        String succes=String.valueOf(basarili);
        System.out.println("succes = " + succes);

        double sayi1=49;
        System.out.println("sayi1 = " + sayi1);//AW -> 49.0
        
        int sayi2=74;
        int sayi3=12;
        System.out.println("sayi2/sayi3 = " + sayi2/sayi3);
        double sonuc=sayi2/sayi3;
        System.out.println("sonuc = " + sonuc);
        /*javada iki int deger bolundugunde sonuc mutlaka int olur.

       Yani bolme ondaliklida olsa casting yaparak int yapar
         */

        byte b=15;
        int num=b; //k -> b AW
        System.out.println("num = " + num);
        int i=1453;
        double d=i;
        System.out.println("d = " + d);
        double d1=d/sayi2;
        System.out.println("d1 = " + d1);
        //Hap bilgi -> Iki farkli data type isleme girerse AW( k data b dataya casting(cevrilir))
        // veri kaybini onlemek icin

        double d2=14.53;
        System.out.println("d2 = " + d2);

        int num2= (int) d2;//Expc. narrow -> buyuk data kucuge ceviriyor.
        System.out.println("num2 = " + num2);

        double d3=571.622;
        System.out.println("d3 = " + d3);
        long l= (long) d3;
        System.out.println("l = " + l);

        int num3=129;
        byte b2= (byte) num3;
        System.out.println("b2 = " + b2); //128 in uzerine sayiyor ve basa donum -128 den ilerliyor ve -127 oluyor




















    }

}
