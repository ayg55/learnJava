package j08_Loops.Loop01_ForLoop.Tasks;

public class Task27 {
    public static void main(String[] args) {
            /* Ex-1: Asagidaki ciktiyi verecek kodu yaziniz
            1.
                        IT: 1
                          QA: 1
                          QA: 2
                          QA: 3
                          .....
                        IT: 2
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
                        IT: 3
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
         */

        for (int i = 1; i < 2; i++) {
            System.out.println("1.");
            for (int j = 1; j < 4; j++) {
                for (int t = 1; t < 12; t++) {
                    System.out.print(" ");
                }
                for (int k = 1; k < 2; k++) {
                    System.out.println("IT: " + j);
                    for (int l = 1; l < 4; l++) {
                        for (int z = 1; z < 14; z++) {
                            System.out.print(" ");
                        }
                        System.out.println("QA: " + l);
                    }
                    for (int y = 1; y < 14; y++) {
                        System.out.print(" ");
                    }
                    System.out.println("....");
                }
            }


        }



    }
}
