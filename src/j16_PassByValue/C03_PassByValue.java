package j16_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        java non-primitive(Class array list-> referans ) data turlerinde obj kendisi değil de dataları değişirse
        obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
         */
        // Task -> list elemanları 24,20,87 iki farklı method ile list elemanlarını
        //      update edip print eden METHOD create ediniz.
        //1. method-> with for each 2. method-> set(index,value)

        List<Integer> list = new ArrayList<>(List.of(24,20,87));

        System.out.println("update oncesi list : " + list);

        listIpdate1(list);
        listIpdate2(list);

        System.out.println("update sonrasi list : " + list);


    }

    private static void listIpdate2(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(0) + 21);
        }
        System.out.println("listUpdate2 meth run edildi : " + list);
    }

    private static void listIpdate1(List<Integer> list) {
        for (Integer each : list) {
            each += 33;
        }
        System.out.println("ListUpdate 1 meth run edildi : " + list);
    }
}
