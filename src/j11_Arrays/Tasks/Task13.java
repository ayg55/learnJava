package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /* TASK :
        Girilen 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )

         */


        int[] arr = createArray();
        int counterDivisibleBy3 = divisibleBy3(arr);
        System.out.println("Number quantity of divisible by 3 in the your array : " + counterDivisibleBy3);


    }

    private static int divisibleBy3(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int[] createArray() {
        int[] arr = new int[8];
        System.out.println("Enter the numbers in the array in order");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter " + (i + 1) + ". number of array");
            int valueOfIndex = scan.nextInt();
            arr[i] = valueOfIndex;
        }
        return arr;
    }

}
