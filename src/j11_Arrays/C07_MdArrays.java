package j11_Arrays;

import java.util.Arrays;

public class C07_MdArrays {

    /*
Çok Boyutlu Diziler
      Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
       Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
       formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
       matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
       satır ve sütun sayısını girmemiz yeterli olacaktır.
      * TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
      Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

 * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> Kat  array
 *  icerdeki  array'lere  inner->Daire array denir
 * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
 *  Array'i ancak tum elemenlari atanarak declare edilmeli
 * 3- Multi dimensional array'de bir elemanin indexi icin
 *  en distaki array haric, elemana kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
 */
    public static void main(String[] args) {

        int [][] arr1 = new int[3][5]; // 3 katli her katta 5 daire olan bos bir md array tanimlandi.
        // -> default olarak her elemana 0 degeri atandi.

        //taskcik -> bir okul icin 7 sinifli 24 ogrencili bir array create ediniz.
        //                 [outer][inner]
        int [][] arr0 = new int[7][24];

        //mdArray eleman atama
        arr1[1][3] = 21;
        arr1[2][4] = 42;
        //arr1[3][7] = 55; //RTE -> out of bound
        System.out.println("arr1[1][3] = " + arr1[1][3]);
        System.out.println("arr1[2][4] = " + arr1[2][4]);
        System.out.println("arr1[0][2] = " + arr1[0][2]);

        System.out.println("Arrays.deepToString(arr1) = " + Arrays.deepToString(arr1));

        int arr2[][] = {
                {12, 15},// 0. kat 2 daireli
                {123, 345, 567},// 1. kat 3 daireli
                {1001},// 2.kat 1 daireli
        };

        /*
toString(mdArr);-> inner array'lerin ref değerini print eder..
toString(mdArr);-> outer(dış) arr Stringe cevirir
outer arr elemanları da print etmek için deeptoString(arr) kullanılmalı
 */

        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        System.out.println("Arrays.deepToString(arr2) = " + Arrays.deepToString(arr2));
        System.out.println("Arrays.toString(arr2[2]) = " + Arrays.toString(arr2[2]));


    }
}
