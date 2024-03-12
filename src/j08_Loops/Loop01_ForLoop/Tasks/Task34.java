package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task34 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6

        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz: ");
        int satirSayisi = scanner.nextInt();

        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= satirSayisi; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }



    }
}


