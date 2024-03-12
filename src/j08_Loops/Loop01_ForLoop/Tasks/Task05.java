package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
          /*
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        şekli print eden code create ediniz
         */

        for (int kat = 0; kat < 6; kat++) {
            for (int daire = 0; daire < 5; daire++) {
                System.out.print("# ");
            }
            System.out.println(); // bos dummy -> kodu etkilemez printin alt satira gecmesini sagliyor
        }


    }

    public static class Task25 {

        /*
               TASK  :
               Bir String içindeki tüm karakterleri en fazla bir kez print eden code create ediniz.
               Test Data:
               input: "aabbcccccddddaaa"
               output: abcd
            */
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("bir metin giriniz");
            String text = scan.nextLine();



        }
    }
}
