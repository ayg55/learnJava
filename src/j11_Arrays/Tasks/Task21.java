package j11_Arrays.Tasks;

import java.util.Arrays;

public class Task21 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu: verilen Arrayın Ayna array olmasını kontrol eden code create ediniz
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
        int arr[] = {1, 2, 7, 4, 4, 3, 2, 1};

        boolean isMirrorArray = checkMirrorArray(arr);
        System.out.println(isMirrorArray);

    }

    private static boolean checkMirrorArray(int[] array) {
        int counter = 0;
        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] == array[array.length - 1 - i]) {
                    counter++;
                }
            }
        }
        return counter == 4;
    }
}

