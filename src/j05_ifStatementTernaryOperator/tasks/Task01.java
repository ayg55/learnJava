package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
         Task->
         Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore print eden code create ediniz.
        0 - 4 => bebek
        5 - 12 => cocuk
        13 - 20 => genc
        21 - 30 => yetiskin
        Tanimlanmamis evre
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yas giriniz : ");
        int age = scan.nextInt();

        if ((age >= 0) && (age <= 4)){
            System.out.println("bebek");
        }else if ((age >= 5) && (age <= 12)) {
            System.out.println("cocuk");
        }else if ((age >= 13) && (age <= 20)) {
            System.out.println("genc");
        }else if ((age >= 21) && (age <= 30)) {
            System.out.println("yetiskin");
        }else{
            System.out.println("tanimlanmamis evre");
        }


    }
}