package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");
        int number = scan.nextInt();
        int counter = 0;

        for (int i = 2; i < number; i++) counter += number % i == 0 ? 1 : 0;

        System.out.println((counter == 0 ? "Asal sayidir" : "Asal sayi DEGILDIR"));


    }
}
