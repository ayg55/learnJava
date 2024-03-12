package j05_ifStatementTernaryOperator.alistirmalar;

import java.util.Scanner;

public class a3 {

    // Kullanıcıdan bir karakter alın ve bu karakterin harf, rakam, özel karakter veya boşluk olduğunu kontrol edin.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz. : ");
        char c = scan.next().charAt(0);

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " bir harftir");
        } else if (c >= 0 && c <= 9) {
            System.out.println(c + " bir rakamdir.");
        } else if ((c == ' ') || (c == '\n') || (c == '\t')) {
            System.out.println(c + " bir bosluktur.");

        } else System.out.println(c + " bir karakterdir.");


    }
}
