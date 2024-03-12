package j01_Variables;
//Haydi devam edelim
public class C01_HelloWorld {//Class basi
    //java yorum satirlarini -> comment line compaile (derleme) etmez
    // -> tek satir yorum
    /*
    coklu satir  : multiple comment line
    bu araya ne yazarsam yazayim java compile etmez
    ahanda trick -> bla bla bla
    bla bla bla
     */

    public static <String> void main(String[] args) {
        //imlecin(cursor) oldugu satir command+D ile alt satira kopyalar
        //imlecin(cursor) oldugu satir command+Z ile onceki aksiyona geri alinir
        /*
        java run edildiginde calismaya ilk olarak main method'dan baslar.
        daha sonra yukaridan asagi ve soldan saga dogru sirasiyla islem yapar
         */
        System.out.println("Hello World");//consola output->cikti veren metodu calistirdim
        System.out.print("Hello World");//consola output->cikti veren metodu calistirdim
        System.out.println("javacanlara selam olsun");//consola output->cikti veren metodu calistirdim

        /*
        print() : yazdirma isleminden sonra komut ayni satirdan devam ettirir.
        printnl() : yazdirma isleminden sonra komut alt satirdan devam eder.
        java'da space(bosluk bir karakter olarak tanimlanir(derlenir)
         */
    }


}//Claas sonu

//selam arkadaslar