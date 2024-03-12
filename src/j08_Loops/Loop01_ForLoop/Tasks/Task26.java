package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        //task -> verilen bir tam sayinin rakamlari toplamini print eden code create ediniz

        Scanner scan = new Scanner(System.in);

        System.out.println("bir tam sayi giriniz");
        String number = scan.next();
        int total = 0;

        for (int i = 0; i < number.length(); i++) {
            int newNum = Character.getNumericValue(number.charAt(i));
            total += newNum;
        }
        System.out.println(total);




    }
}
