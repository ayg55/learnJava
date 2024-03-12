package j11_Arrays.Tasks;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */
        // code start here

        int[] arr = {12,2,5,15,8};
        Arrays.sort(arr);
        System.out.println("arr[arr.length] = " + arr[arr.length - 1]);

    }
}

