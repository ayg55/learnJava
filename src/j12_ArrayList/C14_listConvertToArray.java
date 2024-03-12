package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_listConvertToArray {

    // list i array a cevirme -> toArray
    public static void main(String[] args) {

        //1. yontem -> toArray(new String[0]); toArray() parametre olarak String[0] olarak eklenir..

        ArrayList<String> countryList = new ArrayList<>(List.of("Alamanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"));

        System.out.println("countryList = " + countryList);
        String[] countryArr = countryList.toArray(new String[0]);
        System.out.println("Arrays.toString(countryArr = " + Arrays.toString(countryArr));

        //2. yöntem -> tanımlanan Array'in data type Object(Hz Adem Class) olarak tanımlanır
        //Trick-> Object(Hz. Adem Class) java'da tanımlı tum Class'ların atası(parenti) olarak tanımlıdır
        //String Integer Double.. etc. Class'lar Object Class için child(evlat)oldugu için istenen durumlarda data type olarak kullanılır.

        Object[] countryArr1 = countryList.toArray();
        System.out.println("Arrays.toString(countryArr1) = " + Arrays.toString(countryArr1));




    }
}
