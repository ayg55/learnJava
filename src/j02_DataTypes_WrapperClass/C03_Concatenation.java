package j02_DataTypes_WrapperClass;

public class C03_Concatenation {

    /*
   Not: char variable'lari matematiksel islemlerde   ASCII degerleri kullanir.
        Ornegin; System.out.println('A' + 'CK'); ekrana AC yerine 132 print eder.
   Note: Java'da "+" sembolunun
           i)Toplama islemi
           ii)Birlestirme Islemi(Concatenation)
         Java "+" sembolu  once toplama yapmaya calisir, yapamazsa birlestirme islemi yapılır aksi halde CTE verir.
*/

    public static void main(String[] args) {

        String isim = "Fstih Anil ";
        String soyad = "Gulun";
        /*
        Birden çok string variable ile farklı data btype variable'lar + ile işlem alınırsa
        java toplama değil birleştirme(Concatenation) yapar.
        Trick-> javada String güçlğü bir Class'dır.Bir + işlemi için String varsa işlem önceleğine göre
        (mürekkep) concatenation(birleştirme) yapar.
        */
        System.out.println(isim+soyad);
        int a=17;
        int b=45;
        System.out.println(isim+soyad+a+b);//Fatih Anil Gulun1745
        System.out.println(a+isim+soyad+b);//17Fatih Anil Gulun45
        System.out.println(a+b+isim+soyad);//62Fatih Anil Gulun
        System.out.println(a+b);//62
        System.out.println(isim+soyad+(a+b));//Fatih Anil Gulun62
        System.out.println((a+b)+isim+soyad);//62Fatih Anil Gulun
        System.out.println(isim+(a-b)+(a+b));//Fatih Anil -2862
        System.out.println(isim+((a+b)+(a-b)));//Fatih Anil 34
        System.out.println(""+a+b);//1745

        char ch='1';//1 ascii = 49
        System.out.println(isim+ch);//Fatih Anil 1
        System.out.println(a+ch+isim);//66Fatih Anil
        System.out.println(isim+(ch+a));//Fatih Anil 66
        System.out.println(a+isim+ch);//17Fatih Anil 1

        //hap bilgi->char data type isleme alindiginda variable type'ina gore farkli cikti verir
        //yani char int ile ascii deger uzerinden toplama yapar, string ile concat(birlestirme)




    }
}
