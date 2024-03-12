package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class _09_2dArray_with_arraylis {

    /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {

        int[][] arr2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        List<Integer> storedList = storeList(arr2d);
        System.out.println("storedList = " + storedList);


    }

    private static List<Integer> storeList(int[][] arr2d) {
        List<Integer> storedList = new ArrayList<>();
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                storedList.add(arr2d[i][j]);
            }
        }
        return storedList;
    }
}