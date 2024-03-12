package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _07_arraylist7 {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {

        List<Integer> arrList1 = new ArrayList<>(List.of(3, 2, 5, 6));
        List<Integer> arrList2 = new ArrayList<>(List.of(5, 8, 9));

        List<Integer> commonValuest = common_values(arrList1, arrList2);
        System.out.println(commonValuest);


    }

    private static List<Integer> common_values(List<Integer> arrList1, List<Integer> arrList2) {
        List<Integer> commonValues = new ArrayList<>();
        for (Integer each : arrList1) {
            if (arrList2.contains(each)) {
                commonValues.add(each);
            }
        }
        return commonValues;

    }
}
