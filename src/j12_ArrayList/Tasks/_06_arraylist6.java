package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 4, 6, 2, 1));

        int hillNumber = hillNum(numbers);
        System.out.println(hillNumber);


    }

    private static int hillNum(List<Integer> list) {
        int number = 0;
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i - 1) > list.get(i) && list.get(i) > list.get(i + 1)) {
                number = list.get(i);
                break;
            }
        }
        return number;
    }
}
