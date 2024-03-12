package j11_Arrays;

import java.util.Arrays;

public class C01_Arrays {

    /*
Array (Dizi): Java'da birden fazla aynı type variable depolamak (store etmek) icin kullanilan bir objedir.
Array tanımlamak için:
1- data type (Bir array'in icerisinde sadece ayni data tipinden variable olmalıdır.)
2- length (length array'e depolanacak  max eleman sayisini belirtir ve length'den  fazla eleman  koyulursa RTE verir)

 Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */

    public static void main(String[] args) {
        //Array declaration
        int a; //declara edilen fakat atama yapilmayan bit variable tanimlandi
        int arr[]; //declara edilen fakan atama yapilmayan bir non-primitive int type array tanimlandi.
        // Trick -> tanimlanan ancak deger atanmayan bir array hicbir aksiyona tabi tutulamaz. -> CTE
        String[] isimler = {"Saim","Halit","Safvet","Abdurrahman","Yucel","Sema"}; //hem declare islemi hem de atama islemi yapilan string type array tanimlandi.
        int sayiArr[] = new int[5]; // eleman sayisi tanimlanmis bos int type array (icinde 5 tane 0 var)
        int[] sayiArr1 = new int[7]; // eleman sayisi tanimlanmis bos int type array
        //Array'e eleman girisi -> update
        sayiArr[3] = 61; // 3. index eleman 61 olarak update edildi.
        sayiArr[4] = 58;
        sayiArr[0] = 55;
        sayiArr[3] = 58; // 3. index eleman 61 iken 58 olarak degistirildi: array elemanlari unique olmak zorunda degildir.

        //Array'in eleman sayisi -> length
        System.out.println(sayiArr.length); //5
        System.out.println("isimler.length = " + isimler.length); //6

        // Array i print etme
        System.out.println("isimler = " + isimler); // [Ljava.lang.String;@3f99bd52
        System.out.println("sayiArr = " + sayiArr); // [I@4f023edb
        // sout(arr) -> Array non-primitive oldugu icin bu sekilde print etme bize referans degeri verir.
        // sout(Arrays.toString(arr)); bu sekilde array in elemanari print edilir.
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler)); // [Saim, Halit, Safvet, Abdurrahman, Yucel, Sema]
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr)); // [55, 0, 0, 58, 58]
        //System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr)); // CTE
        System.out.println("Arrays.toString(sayiArr1) = " + Arrays.toString(sayiArr1)); // [0, 0, 0, 0, 0, 0, 0]

        // Array'in son index elemanini print etme
        System.out.println("Son index eleman : " + sayiArr[sayiArr.length - 1]);
        System.out.println("Ilk index eleman : " + sayiArr[0]);

        //Array'de olmayan index elemani yazdirma
        //System.out.println(sayiArr[42]); // RTE -> ArrayIndexOutOfBoundsException

        //Arrayin elemanlarini print etme -> bad practice (istenmeyen sekilde)
        //yazdirmak icin bu iyi
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler)); // [Saim, Halit, Safvet, Abdurrahman, Yucel, Sema]

        //Arrayin elemanlarini print etme -> best practice
        // elemanlari ile oynayacaksak bu iyi
        for (int i = 0; i < isimler.length; i++) { //array elemanlari sayisi kadar tanimlandi
            System.out.print(isimler[i] + " "); // tekrardan alinan her bir array elemani print edildi. // Saim Halit Safvet Abdurrahman Yucel Sema
        }
        System.out.println();

        //Array'i natural(dogal) siralama alfabetik veya kucukten buyuge
        System.out.println("Sort oncesi isimler arr : " + Arrays.toString(isimler));
        Arrays.sort(isimler); // Array siralandi
        System.out.println("Sort sonrasi isimler arr : " + Arrays.toString(isimler));

        System.out.println("Sort oncesi isimler arr : " + Arrays.toString(sayiArr)); // [55, 0, 0, 58, 58]
        Arrays.sort(sayiArr); // Array siralandi
        System.out.println("Sort sonrasi isimler arr : " + Arrays.toString(sayiArr)); // [0, 0, 55, 58, 58]



    }
}
