package j12_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C13_sort_reverse {

    //sort():-> list elemanlarını doğal (NATUREL ORDER) sıralama yapar

    public static void main(String[] args) {

        ArrayList<String> countryList = new ArrayList<>(List.of("Alamanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"));

        System.out.println("before sort process countryList = " + countryList); // [Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya]
        Collections.sort(countryList);
        System.out.println("after sort process countryList = " + countryList); // [Alamanya, Belcika, Danimarka, Finlandiya, Hollanda, Isvec]

       // reverse() meth list elemanlarını index'e göre ters sıralar

        List<Integer> numberList = new ArrayList<>(List.of(23,12,21,62,49,11,7,16));
        System.out.println("before reverse process numberList = " + numberList);
        Collections.reverse(numberList);
        System.out.println("after reverse process numberList = " + numberList);


    }
}
