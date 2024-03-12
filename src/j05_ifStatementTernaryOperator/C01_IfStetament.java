package j05_ifStatementTernaryOperator;

public class C01_IfStetament {

    /*
    if statement blok herhangi bir actionun belirli bir şarta bağlı çalışmasını sağlamak için kullanılır.
    */

    public static void main(String[] args) {

        int semraYas=16;
        int merveYas=28;
        if (semraYas==merveYas){
            System.out.println("Yasdas arkadaslar");
            System.out.println("Yoksa siz ikiz misiniz?");
        }
        if (merveYas>=40) System.out.println("Merve hanim yasi 40'tan buyuk");
//If blok'tan sonta tek satirlik islem varsa {} gerek yok
        if (merveYas+semraYas>=45) System.out.println("Tek satirlik aksiyonlarda {} kullanilmaz");
        System.out.println("Javacan'lara selam olsun");

        System.out.println("Bu ciktiyi okuyorsan kod calisiyordur");







    }

}
