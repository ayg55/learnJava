package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {

    //Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" edilmeli.
//Scanner Class'i Java nin util kutuphanesindedir.

// kullanıcıdan veri almak içinn şu adım takip edilir
//1. adım-> Scanner class'dan obj create edilir.

//  Scanner input = new Scanner(System.in);// Scanner classından input isminde değerini System içinden alan bir obj.

//  // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
//  System.out.print("adınızı giriniz :");

//  // 3. adım-> kulanıcının girdigi veri data type'ne göre bir variable atanır.

    public static void main(String[] args) {

        // task-> kullanıcının girdigi değere göre karenin alanını print eden code create ediniz

        //1. adim Scanner obj create
        Scanner scan=new Scanner(System.in);
        //2. adim bilgilendirme
        System.out.println("Alanini hesaplamak istediginiz karenin bir kenarinin olcusunu giriniz : ");
        //3. adim kullanicinin girdigi degeriuygun bir variableye atama.
        int kenar=scan.nextInt();
//        int kareAlani=kenar*kenar;
//        System.out.println("kareAlani = " + kareAlani); // birden cok kullanilacaksa bu islem bare alani diye bir degisken atanir.
        System.out.println("kareAlani = " + (kenar*kenar)); // bir kez kullanacaksak memory de yer kaplamamasi icin direk sout un icinde islem yapilir.

        /*
        Task->
        Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
        Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
        1 seker = 1.7 gr
        Ornek : Input : cay sayisi : 10 seker sayisi :
        Output : Yilda 12.41 kg seker kullaniyorsunuz
 */
        //2. adim
        System.out.println("Gunde kac bardak cay iciyorsunuz : ");
        //3. adim
        int gunlukCayMiktari=scan.nextInt();
        //seker miktari icin 2. adima geri donuyoruz tekrarlanacak 2. adim.
        //2. adim
        System.out.println("Cay'a kac seker atiyorsunuz : ");
        //3.adim
        int sekerSayisi=scan.nextInt();
        System.out.println("Yilda "+(gunlukCayMiktari*sekerSayisi*1.7*365)/1000+" kg seker kullaniyorsunuz.");














    }
}
