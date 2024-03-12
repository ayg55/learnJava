package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(List.of("New jersey", "New york", "Atlanta", "Florida", "Ohio"));
        List<String> rotatedCities = rotateList(cities);
        System.out.println(rotatedCities);

    }

    private static List<String> rotateList(List<String> list) {
        List<String> rotatedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            rotatedList.add(list.get(i));
        }
        return rotatedList;
    }
}

