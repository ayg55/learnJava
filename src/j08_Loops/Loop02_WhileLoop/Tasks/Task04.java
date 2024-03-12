package j08_Loops.Loop02_WhileLoop.Tasks;

public class Task04 {

    public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.
		 */

        int i = 1;
        int counter = 0;

        while (i < 1000) {
            if (i % 24 == 0) {
                counter++;
                System.out.print(i + "\t");
            }
            i++;
        }
        System.out.println("\n" + counter + " tane sayi vardir");


    }

}
