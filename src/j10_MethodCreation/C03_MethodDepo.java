package j10_MethodCreation;

public class C03_MethodDepo {
    // her class da main mehthod zorunlulugu yoktur. Belirli aksiyonlar icin ozel class tanimlanir.

    public static void gecmeNotu(int not) {
        if (not >= 85) {
            System.out.println("takdir belgesi kazandiniz");
        } else if (not >= 70) {
            System.out.println("tesekkur belgesi kazandiniz");
        } else if (not >= 50) {
            System.out.println("Tekrar dene");
        }else {
            System.out.println("Meb izin vermese sinifida gecemezdin");
        }
    }

}
