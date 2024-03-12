package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_subList {

    //sublist() -> listini istenen list parcasını(şu index'ten şu index'e parcasını) return eder
    public static void main(String[] args) {

        ArrayList<String> countryList = new ArrayList<>(List.of("Alamanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"));

        System.out.println("subList oncesi countryList = " + countryList); //[Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya]

        System.out.println("countryList.subList(1,4) = " + countryList.subList(1, 4)); //[Isvec, Danimarka, Belcika]
        System.out.println("subList sonrasi countryList = " + countryList); //[Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya]

        List<String> newList = new ArrayList<>(countryList.subList(2, countryList.size())); //2. index'den list in sonuna kadar.
        System.out.println("newList = " + newList);


    }
}
