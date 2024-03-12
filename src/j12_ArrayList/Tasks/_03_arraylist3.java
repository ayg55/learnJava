package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {
        List<String> city = new ArrayList<>(List.of("New jersey", "New york", "Ohio", "Florida", "Boston"));

        List<Integer> lengthList = getLength(city);
        System.out.println(lengthList);


    }

    private static List<Integer> getLength(List<String> List) {
        List<Integer> lengthList = new ArrayList<>();
        for (String each : List) {
            lengthList.add(each.length());
        }
        return lengthList;
    }
}