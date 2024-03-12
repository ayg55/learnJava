package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task11 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /* task-> girilen ifadeyi 'hacker' dilinde print eden METHOD create ediniz

        a->7
        v->1
        c->-4
        e->2
         */

        hackerLanguageConverter();
        //hackerLanguageConverter(); // bu uzun yoldu



    }//main sonu

    private static void hackerLanguageConverter() {
        System.out.println("Bir metin giriniz");
        String text = input.nextLine();
        String hackerText;
        hackerText = text.replace("a","7").replace("v","1")
                .replace("c","-4").replace("e","2");
        System.out.println(hackerText);
    }

//    private static void hackerLanguageConverter() {
//        System.out.println("Bir metin giriniz");
//        String text = input.nextLine();
//        String hackerText = "";
//        for (int i = 0; i < text.length() - 1; i++) {
//            switch (text.charAt(i)) {
//                case 'a':
//                    hackerText += '7';
//                    break;
//                case 'v':
//                    hackerText += '1';
//                    break;
//                case 'c':
//                    hackerText += '-4';
//                    break;
//                case 'e':
//                    hackerText += '2';
//                    break;
//                default:
//                    hackerText += text.charAt(i);
//            }
//        }
//        System.out.println(hackerText);
//    }


}//Class sonu
