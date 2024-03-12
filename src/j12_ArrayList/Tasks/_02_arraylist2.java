package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(List.of(1,2,3,4,5));

        int sum = getSum(arrayList);
        System.out.println(sum);

    }

    private static int getSum(List<Integer> arrayList) {
        int sum = 0;
        for (int each : arrayList) {
            sum += each;
        }

        return sum;
    }
}
