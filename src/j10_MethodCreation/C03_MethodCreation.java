package j10_MethodCreation;

import static j10_MethodCreation.C03_MethodDepo.gecmeNotu;

public class C03_MethodCreation {

    public static void main(String[] args) { //-> benim koyum
        String hlt = "en hakiki javaci";
        String sema = "javaNAZZZ";
        selamVer(); // tanimlandigi class scopta method name ile direct call edilebilir.
        System.out.println("hlt = " + hlt);
        System.out.println("sema = " + sema);
        /*  Farkli classlardan method call etmek icin clasName.methofName ile ya da class import edilerek call islemi yapilir
            static method olarak call edilir.
            Ayni classda method dogrudan name ile call edilir.
         */
        C03_MethodDepo.gecmeNotu(88); //Class name ile meth call edildi -> komsu koyun amelesi koyun ismi ile cagrildi
        gecmeNotu(43); // import edildi.


    }


    private static void selamVer() { // koyumun amelesi
        System.out.println("beni koyumun yagmurlarinda yikasinlar.");
        gecmeNotu(55); // main disina farkli meth icine call edildi
    } //main sonu

    //gecmeNotu(66); // Method disina ama meth call islemi olmaz

} //class sonu

