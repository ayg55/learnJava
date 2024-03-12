package j12_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C15_arrayConvertToList {

    //King of Trick -> Array'dan liste cevirme yapıldıgında list kaynagı array oldugu için list array gibi davranır:
    //eleman akleme ve silme yapılamaz-> add() remove() method çalışmaz RTE verir.

    public static void main(String[] args) {

        String[] countryArr = {"Alamanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"};
        List<String> countryList = Arrays.asList(countryArr);
        System.out.println("Arrays.toString(countryArr) = " + Arrays.toString(countryArr));
        System.out.println("countryList = " + countryList);
        // System.out.println("countryList.add(\"Fransa\") = " + countryList.add("Fransa")); // RTE -> UnsupportedOperationException
        // System.out.println("countryList.remove(\"Alamanya\") = " + countryList.remove("Alamanya")); RTE -> UnsupportedOperationException


    }
}
