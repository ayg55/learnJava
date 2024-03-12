package j11_Arrays;

import java.util.Arrays;

public class C03_Array_BinarySearch {

    // Arrays.binarySearch(arr,value);-> girilen arraydeki istenen eleman kontrolu

    public static void main(String[] args) {
        int [] numberArr = {23,44,2,11,55,60,32,34,58,22,9,64,42};
        int number1 =44;
        int number2 = 20;
        System.out.println("Amele code");
        boolean flag = false; //bayrak asagi
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] == number1) {
                flag = true; //bayrak yukari
                break;
            }
        }
        System.out.println(flag ? "Aradiginiz sayi array de mevcut" : "Aradiginiz sayi array de mevcut");

        System.out.println("Cincix code");

        Arrays.sort(numberArr); //sort islemi yapildi -> k->b siralandi
        System.out.println("Array'da 20 nin varligi : " + Arrays.binarySearch(numberArr,number1));
        System.out.println("Array'da 44 nin varligi : " + Arrays.binarySearch(numberArr,number2));
    }
}
