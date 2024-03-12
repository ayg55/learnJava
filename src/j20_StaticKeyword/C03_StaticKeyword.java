package j20_StaticKeyword;

public class C03_StaticKeyword {
    int ogrId;//inst(Obj) variable
    static int ogrSayisi;//static(class) variable

    public C03_StaticKeyword() {//psiz const
        ogrSayisi++;//bu const call edildiginde yani obj cerate edildiginde
        //ogrSayisi static variable kalici(her obj icin ayni deger) olarak arttirilir
        ogrId++;//bu const call edildiginde yani obj cerate edildiginde
        //ogrId cerate edilen obj'ye ozel deger alir
    }

    public static void main(String[] args) {
        System.out.println("a obj oncesi ogrenciSayisi : "+ogrSayisi);//0
        C03_StaticKeyword a=new C03_StaticKeyword();
        System.out.println("a obj sonrasi ogrenciSayisi : "+ogrSayisi);//1
        C03_StaticKeyword b=new C03_StaticKeyword();
        C03_StaticKeyword c=new C03_StaticKeyword();
        C03_StaticKeyword d=new C03_StaticKeyword();
        System.out.println("a,b,c,d obj'leri sonrasi ogrenciSayisi : "+ogrSayisi);//4

        C03_StaticKeyword e;//obj decleration ama assaingment yapilmamis->const call yok
        System.out.println("e obj sonrasi ogrenciSayisi : "+ogrSayisi);//4
        System.out.println("a ogrId : "+a.ogrId);//1
        System.out.println("b ogrId : "+b.ogrId);//1
        System.out.println("c ogrId : "+c.ogrId);//1
        System.out.println("d ogrId : "+d.ogrId);//1
        //System.out.println("e.ogrId = " + e.ogrId);

    }
}
