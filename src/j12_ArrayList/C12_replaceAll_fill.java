package j12_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C12_replaceAll_fill {

    //replaceAll();-> List'te belirli bir elemanı belirli bir elemana update eder.treu/ false return eder

    public static void main(String[] args) {

        ArrayList<String> countryList = new ArrayList<>(List.of("Alamanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"));

        System.out.println("before replaceAll process countryList = " + countryList);
        System.out.println("Collections.replaceAll(countryList,\"Danimarka\",\"Fransa\") = "
                + Collections.replaceAll(countryList, "Danimarka", "Fransa"));
        System.out.println("after replaceAll process countryList = " + countryList);

        // //fill()-> list'tin tum elemanlarını istenen değere update eder...

        Collections.fill(countryList,"Hollanda");
        System.out.println("after fill process countryList = " + countryList);


    }
}
