package j02_DataTypes_WrapperClass;

public class C01_VariableCreate {

    /*Variable
 bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
 Variable icinde deger saklayan bir container'dir
 bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
örneğin bir okulun öğrenci sayısı için variable data türü String,boolean,char veya double alınmamalı.
geriye kalan tamsayı  turlerınden okulun öğrenci sayısını içine alabilecek büyüklükte bir data turu secilir
*** genelde tam sayılar için int ondalıklı sayılar için double kullınılır..
*/

    public static void main(String[] args) {

        //variable create(degisken olusturmak) icin ...
        //1- Data Type(degisken turu)     2-Variable name(degisken ismi)  '="(atama operatoru)    3-value(degiskenin degeri)

                    int                           selimYas                 =                                 35; //memory'de int type selimYas isminde 35 egerinde bir variable olusturuldu
                           //declaration(tanimlama)                        =                        assaigment(Atama)
        //1.yol -> best practice (recommended -> tavsiye edilen)

        int yas =33;
        int maas=10000;
        System.out.println(yas);
        System.out.println("yas");

        System.out.println("selimYas = " + selimYas);

        System.out.println("Yucel bey maas = "+maas);

        //2. yol

        int boy;// int data type boy adinda bir variable tanimlandi -> declaration
        //System.out.println(boy); ( oncesinde declaratition variableye deger atamasi(assaigment) yapildi.)
        boy=190;
        System.out.println(boy);

        //3. yol

        int yevmiye,kilo,tecrube;//birden cok ayni turde variable tanimlandi => declaration
        yevmiye=400;
        kilo=90;
        tecrube=7;

        //cincix kod

        int gunluk=550,agirlik=88,experiance=10; //birden cok ayni turde variable tanimlandi => declaration ve deger atandi.

        System.out.println(" gunluk = "+gunluk+" agirlik = "+agirlik+" tecrube = "+experiance);

        //hataa -> oncesinde tanimlanmis bir variable tekrar tanimlanamaz -> CTE
        yas =58; //tanimlanmis olan bir varialble yeniden deger atamasi yapildi -> deger degisti




    }

}
