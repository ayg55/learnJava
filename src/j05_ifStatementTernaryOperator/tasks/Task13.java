package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /*
          TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

         */
        Scanner scan = new Scanner(System.in);

        System.out.println("1. sayiyi giriniz : ");
        int n1 = scan.nextInt();
        System.out.println("2. sayiyi giriniz : ");
        int n2 = scan.nextInt();
        System.out.println("Lutfen yapmak istediginiz islemi belirtiniz(ingilizce karakter kullenin) : ");
        String p = scan.next();
        String i = p.toLowerCase();

        if (i.contains("topla")) System.out.println(n1 + n2);
        if (i.contains("cikar")) System.out.println(n1 - n2);
        if (i.contains("carp")) System.out.println(n1 * n2);
        if (i.contains("bol")) System.out.println(n1 / n2);






    }
}
