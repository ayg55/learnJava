package j11_Arrays.Tasks;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        //task-> aşağıdaki  arr  tum elemalarının çarpımını print eden code create edinz
        int arr[][]={
                {3,5},//0. kat
                {2,4,1},//1. kat
                {6,1,2,2},//2. kat
        };

        int multiply = printArr2d(arr);
        System.out.println("multiply of array's element : " + multiply);

    }

    private static int printArr2d(int[][] array) {
        int multiply = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                multiply *= array[i][j];
            }
        }
        return multiply;
    }
}
