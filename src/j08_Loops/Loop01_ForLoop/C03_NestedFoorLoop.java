package j08_Loops.Loop01_ForLoop;

public class C03_NestedFoorLoop {

    /*
    Bir loop body'de {loop}  farklı bir loop tanımlanmasıyla oluşan code blok'a nested loop denir.-> apt. daire döngüsü
    iç loop dış  loop'un her step'inde tekrar çalışır.en içteki lopp bitmeden dış lopp bitmez. ilk önce en içdeki lopp run olur
    */

    public static void main(String[] args) {

        for (int kat = 1; kat <= 5; kat++) {
            for (int daire = 1; daire <= 3; daire++) {
                System.out.println("kat : "+ kat + " icin daire no : " + daire);
            }

        }

    }

}
