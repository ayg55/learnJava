package j08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {

    public static void main(String[] args) {

        // task-> girilen tamsayının pozitif tam bolen sayısını print eden code create ediniz...
        // 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
        // 30 -> 1,2,3,5,6,10,15,30: 30'un 8 tane tam böleni var

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir pozitif tam sayi giriniz : ");
        int sayi = scan.nextInt();

        int bolen = 1;
        int counter = 0;

        while (bolen <= sayi) {
            counter += sayi % bolen == 0 ? 1 : 0;
            bolen++;
        }
        System.out.println(counter);


















    }

}
