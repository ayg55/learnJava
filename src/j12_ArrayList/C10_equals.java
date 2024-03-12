package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C10_equals {

    //equals()-> iki listin hem index hem de value (değer) eşitliğini kontrol eder true/false return eder

    public static void main(String[] args) {

        ArrayList<String> countryList1 = new ArrayList<>(List.of("Alamanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"));
        ArrayList<String> countryList2 = new ArrayList<>(List.of("Alamanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"));
        System.out.println("countryList1.equals(countryList2) = " + countryList1.equals(countryList2));
        System.out.println("countryList2.equals(countryList1) = " + countryList2.equals(countryList1));

        countryList2.set(1,"Kuba");

        System.out.println("countryList1.equals(countryList2) = " + countryList1.equals(countryList2));

        String[] arr = {"Alamanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"};

    }
}
