package j11_Arrays.Tasks;

import java.util.Arrays;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın..
         */

        int[] arr = {-5, 6, 8, 12, 14, -19};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }else sum -= arr[i];
        }
        System.out.println("sum = " + sum);
        //Kodu aşağıya yazınız.


    }
}
