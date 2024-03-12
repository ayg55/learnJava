package j02_DataTypes_WrapperClass;

public class C04_WrapperClass {

    /*
       Note: Java primitive lere method'lar ekleyerek yeni bir
             yapi olusturdu, bu yapiya "Wrapper Class"
             Primitive         Wrapper
                byte     ==>    Byte
                short    ==>    Short
                ** int   ==>    Integer
                long     ==>    Long
                float    ==>    Float
                double   ==>    Double
                boolean  ==>    Boolean
                ** char  ==>    Character
    */

    public static void main(String[] args) {

        //Javada bir degiskenin data type icin getClass() methodu kullanilir. Bu nesne(obj) hangi class'dan uretildiyse onu verir.
        String str = "JavaCan";
        int yas = 45;
        double pi = 3.14;
        System.out.println(str.getClass()); //class java.lang.String
        //System.out.println(yas.getClass()); // CTE -> yas primitive oldugu icin class i yoktur
        //System.out.println(pi.getClass()); //TE -> pi primitive oldugu icin class i yoktur
        
        /*
        Integer.volueOf(yas) veya Double.valueOf(pi) ifadeleri kullanilarak ilkel veri tipleri Wrapper class a donusturulur.
        getClass methodu kullanilabilir.
         */
        
        String isim = "Safvet";
        System.out.println("isim = " + isim);
        System.out.println("isim.toUpperCase() = " + isim.toUpperCase());

        /*
        non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        ancak primitive data turlerinin boyle bir ozelligi yoktur
        primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        ara çözüm imkanı sunmuştur.
         */

        // task-> id ve tc String değerlerini toplamını print code create ediniz..

        String id = "12345";
        String tc = "1234567";

        System.out.println(id+tc);

        Integer yeniId = Integer.valueOf(id); // Strinh olan value integer a cevrildi
        Integer yeniTc = Integer.valueOf(tc); // Strinh olan value integer a cevrildi

        System.out.println("yeniTc = " + yeniTc);
        System.out.println("Toplam = "+(yeniId+yeniTc));

        String okulNo = "3435a";
        //int okulNosu = 2325a //CTE
//        int yeniOkulNo = Integer.parseInt(okulNo); //okulNo Integer a atandi. -> Run time Exception
//        System.out.println(yeniOkulNo);

        // task-> byte short int data type max ve min değerlerini print eden code create ediniz.
        Byte byMaxDeger = Byte.MAX_VALUE;
        Byte byMinDeger = Byte.MIN_VALUE;
        System.out.println("byMaxDeger = " + byMaxDeger);
        System.out.println("byMinDeger = " + byMinDeger);

        Short shMaxDeger = Short.MAX_VALUE;
        Short shMinDeger = Short.MIN_VALUE;
        System.out.println("shMaxDeger = " + shMaxDeger);
        System.out.println("shMinDeger = " + shMinDeger);

        Integer inMaxDeger = Integer.MAX_VALUE;
        Integer inMinDeger = Integer.MIN_VALUE;
        System.out.println("inMaxDeger = " + inMaxDeger);
        System.out.println("inMinDeger = " + inMinDeger);









    }

}
