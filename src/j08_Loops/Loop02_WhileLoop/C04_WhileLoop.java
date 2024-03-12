package j08_Loops.Loop02_WhileLoop;

public class C04_WhileLoop {

    public static void main(String[] args) {

        //task-> 3 basamaklı 4 ile tam bölünen sayıları print eden code create ediniz

        for (int i = 100; i < 1000; i+=4) {
            System.out.print(i + "\t");
        }

        int i = 100;

        System.out.println();

        while (i < 1000) {
            System.out.print(i + "\t");
            i+=4;
        }

    }

}
