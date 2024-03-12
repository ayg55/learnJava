package j08_Loops.Loop01_ForLoop.Tasks;

public class Task32 {
    public static void main(String[] args) {
        /*

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        şeklipriint eden code create ediniz

         */

       // ipucu : artis ve azalis kisimlarini 2 ayri nested loop ile yapmalisiniz

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }


    }
}
