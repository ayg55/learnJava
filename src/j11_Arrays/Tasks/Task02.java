package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;


public class Task02 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz.

        sumArr();


    }

    private static void sumArr() {
        int counter = 1;
        System.out.println("Kac tane sayi gireceksiniz");
        int lengthArr = scan.nextInt();
        int[] arr = new int[lengthArr];
        int sum = 0;
        for (int i = 0; i < lengthArr; i++) {
            System.out.println(counter + ". sayiyi giriniz");
            int number = scan.nextInt();
            arr[i] = number;
            sum += arr[i];
            counter++;
        }
        System.out.println("Sayilarin toplami : " + sum);
    }
}
