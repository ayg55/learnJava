package j11_Arrays.Tasks;

import java.util.Arrays;

public class Task12 {

    public static void main(String[] args) {
		/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
        int arr[] = {2, 6, 4, 5, 8, 9};


        System.out.println(Arrays.toString(square(arr)));


    }

    private static int[] square(int[] array) {
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = (int) Math.pow(array[i],2);
        }
        return newArr;
    }

}
