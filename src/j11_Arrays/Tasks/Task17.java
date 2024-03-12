package j11_Arrays.Tasks;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        // task-> asağıdaki sayi arr'deki en buyuk elemanı print eden code create ediniz...

        int arr[][] = {
                {3, 5},//0. kat
                {2, 4, 1},//1. kat
                {6, 1, 2, 2},//2. kat
        };

        int greaterNumber = greaterNumber(arr);
        System.out.println("greaterNumber = " + greaterNumber);


    }

    private static int greaterNumber(int[][] array) {
        int greaterNumber = -2147483648;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > greaterNumber) {
                    greaterNumber = array[i][j];
                }
            }
        }
        return greaterNumber;
    }
}
