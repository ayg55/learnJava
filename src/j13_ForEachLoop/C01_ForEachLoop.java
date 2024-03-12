package j13_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {

    /*
for-each loop for loop'un gelişmiş halıdir.
1. clean code- yazım kolaylığı
2. code okuma kolaylıgı
3. hata yapma riskini azaltır.
 */
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>((List.of(16, 21, 33, 54, 15, 45, 58)));

        System.out.println("** Task 01 **");

        // Task01-> sayiList elemanlarını ayrı satırda print eden code create ediniz.

        System.out.println("** For i **");
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println(numberList.get(i));
        }

        System.out.println("** For Each **"); // int kullanirsak daha az method kullaniriz for icine each ile.

        for (int each : numberList) {
            System.out.println(each);
        }
        //(data type variable : data source(Collection))
        for (Integer each : numberList) { //Integer kullanirsak daha fazla method kullanabiliriz for icinde each ile
            System.out.println(each);
        }

        System.out.println("   ***   Task02   ***   ");
        // task2-> sayiList tek elemanlarını ilk 3 eleman hariç print eden code create ediniz.

        for (Integer each : numberList.subList(3,numberList.size())) {
            if (each % 2 == 1) {
                System.out.println(each + " ");
            }
        }

        System.out.println("   ***   Task03   ***   ");
        // task03-> sayiList  elemanlarını 2 ve 5 index(2,3,4,5) dahil  toplamını print eden code create ediniz.

        int sum = 0;

        for (Integer each : numberList.subList(2,6)) {
            sum += each;
        }
        System.out.println("sum = " + sum);






    }
}
