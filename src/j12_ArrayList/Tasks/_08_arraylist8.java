package j12_ArrayList.Tasks;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(List.of(5, 3, 4, 6, 7));

        int secondMax = secondMax(arrayList);
        System.out.println("secondMax = " + secondMax);
    }

    private static int secondMax(List<Integer> list) {
        List<Integer> soortedList = new ArrayList<>(list);
        soortedList.sort(Comparator.reverseOrder());
        int secondMax = soortedList.get(1);
        return secondMax;
    }
}
