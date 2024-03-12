package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _01_arraylist1 {
    static Scanner scan = new Scanner(System.in);
    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */


    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>(List.of("Orange", "Kiwi", "Peach", "Banana", "Orange"));
        System.out.println(fruit);
        System.out.println("Hangi meyveyi sorgulayacaksiniz");
        String fruitName = scan.next();
        int count = getCount(fruit, fruitName);
        System.out.println(count);


    }

    private static int getCount(ArrayList<String> stringArrayList, String fruitName) {
        int counter = 0;
        for (String each : stringArrayList) {
            if (each.equalsIgnoreCase(fruitName)) {
                counter++;
            }
        }
        return counter;
    }
}
