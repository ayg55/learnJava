package j11_Arrays.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task20 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // Task-> verilen bir array'den istenmeyen elemanı silip  kalanlari
        // yeni bir array'a atayıp print eden METHOD create ediniz

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};

        int[] newArr = deleteElement(arr);
        System.out.println(Arrays.toString(newArr));
    }

    private static int[] deleteElement(int[] array) {
        int counter = 0;
        int index = 0;
        System.out.println(Arrays.toString(array));
        System.out.println("Lutfen silmek istediginiz elemani giriniz");
        int elementToBeDeleted = scan.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToBeDeleted) {
                counter++;
            }
        }
        int[] arr = new int[array.length - counter];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToBeDeleted) {
                continue;
            }
            arr[index] = array[i];
            index++;
        }


        return arr;
    }
}
