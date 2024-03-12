package j11_Arrays;

import java.util.Arrays;

public class C05_Arrays_Equals {

    // Arrays.equals(arr1,arr2);-> girilen iki arrayin index ve eleman value kontrolu yapar true false return eder

    public static void main(String[] args) {

        int[] arr1 = {2, 5, 13, 65, 49, 38, 33, 58, 27};
        int[] arr2 = {21, 52, 14, 63, 49, 31, 35, 53, 26};

        System.out.println("Arr1 Arr2'ye esit mi : " + Arrays.equals(arr1,arr2));
        System.out.println("arr1[3] == arr2[3] = " + (arr1[3] == arr2[3]));
        System.out.println("(arr1[4] == arr2[4]) = " + (arr1[4] == arr2[4]));

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Arr1 Arr2'ye esit mi(sort tan sonra) : " + Arrays.equals(arr1,arr2));

        //Array'i Stringe convert(cevirme)

        String str = Arrays.toString(arr1);
        System.out.println("str = " + str); // str = [2, 5, 13, 27, 33, 38, 49, 58, 65]
        System.out.println("str.substring(5) = " + str.substring(5)); //str.substring(5) = , 13, 27, 33, 38, 49, 58, 65]

    }
}
