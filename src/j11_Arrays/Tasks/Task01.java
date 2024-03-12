package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;


public class Task01 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //Task-> girilen bir int array elemanlarını buyukten kucuge   print eden code create ediniz.

        soortArray();

    }

    private static void soortArray() {
        System.out.println("gireceginiz sayi miktarini giriniz");
        int lengthOfArr = scan.nextInt();
        int[] arr = new int[lengthOfArr];

        int number;
        int counter = 1;

        for (int i = 0; i < lengthOfArr; i++) {
            System.out.println(counter + ". sayiyi giriniz");
            number = scan.nextInt();
            arr[i] = number;
            counter++;
        }
        Arrays.sort(arr);
        for (int i = 0; i < lengthOfArr / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[lengthOfArr - 1 - i];
            arr[lengthOfArr - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}

