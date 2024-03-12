package j24_Inheritance.inheritance02;

public class Runner {
    public static void main(String[] args) {
        // DataType   obje = Const
        Kedi k1 = new Kedi(); //Kedi class type obj create edildi
        System.out.println("k1.a = " + k1.a); //0
        System.out.println("k1.c = " + k1.c); //2
        System.out.println("k1.d = " + k1.d); //7
        System.out.println("k1.m = " + k1.m); //1

        Memeliler k2 = new Kedi("beyaz"); //variable olarak datatype olam memelilere gider. method olarak class a kediye gider.
        System.out.println("k2.a = " + k2.a);
        System.out.println("k2.c = " + k2.c);
        //System.out.println("k2.d" + k2.d); // -> CTE -> dataType Memeliler Class'da d variable tanimli olmadigi icin hata aliyoruz.
        System.out.println("k2.m = " + k2.m); //1

        Hayvanlar k3 = new Kedi("poncik"); //Hayvanlar dataType obje create edildi
        System.out.println("k3.a = " + k3.a);
        System.out.println("k3.m = " + k3.m);
        //System.out.println("k3.c = " + k3.c); // -> CTE -> dataType Hayvanlar Class'da d variable tanimli olmadigi icin hata aliyoruz.
        //System.out.println("k3.d = " + k3.d); // -> CTE -> dataType Hayvanlar Class'da d variable tanimli olmadigi icin hata aliyoruz.
        /*
        Ahan da trick köşesinde böğün->inherit edilmiş herhangi bir obj varaible  Data type göre call edilir
        Variable araştırmaya data type Class'dan başlanıp parentlere gidilir.
        */
    }
}
