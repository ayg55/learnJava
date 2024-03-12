package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {


        // task-> istenilen kadar tamsayının toplamını print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        int i = 1;
        int total = 0;
        System.out.println("Kac tane sayi gireceksiniz");
        int n = scan.nextInt();
        while (i <= n) {
            System.out.println("Lutfen " + i + ". sayiyi giriniz.");
            int number = scan.nextInt();
            total += number;
            i++;
        }
        System.out.println(total);


    }

}
