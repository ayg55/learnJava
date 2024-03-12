package j13_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        // task-> iki string array elemanlarının ortak olmasını kontrol edip print eden code create ediniz..with for-each

        String[] arr1 = {"Sema", "Savfet", "Saim", "Saliha", "Yucel", "Dogukan", "Halit"};
        String[] arr2 = {"Sema", "Semra", "JavaCan", "Saliha", "Savfet", "Dogukan", "JavaNur"};

        List<String> ortakElemanlar = new ArrayList<>();

        for (String each1 : arr1) {
            for (String each2 : arr2) {
                if (each1.equals(each2)) {
                    ortakElemanlar.add(each1);
                    //ortakElemanlar.add(each2);
                }
            }
        }
        System.out.println("ortakElemanlar = " + ortakElemanlar);
    }
}
