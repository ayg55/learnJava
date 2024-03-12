package j08_Loops.Loop01_ForLoop.Tasks;

public class Task13 {

    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..

        */
        int harf = 65;
        for (int i = 0; i < 6; i++) {
            for (int j = -1; j < i; j++) {
                System.out.print((char)(harf + i) + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        char letter = 'A';

        for (int i = 0; i < 6; i++) {
            for (int j = -1; j < i; j++) {
                System.out.print(letter + "\t");
            }
            letter ++;
            System.out.println();
        }




    }
}
