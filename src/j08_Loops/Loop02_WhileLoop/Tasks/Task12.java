package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin = scan.nextLine().replace(" ","");
        int harfSayisi = 0;
        int rakamSayisi = 0;
        int karakterSayisi = 0;
        int index = 0;
        
        do {
            if (metin.isEmpty()) {
                System.out.println("Bir metin girin");
            } else if (Character.isDigit(metin.charAt(index))) {
                rakamSayisi++;
            } else if (Character.isLetter(metin.charAt(index))) {
                harfSayisi++;
            }else {
                karakterSayisi++;
            }

            index++;

        }while (index <= metin.length() - 1);

        System.out.println("karakterSayisi = " + karakterSayisi);
        System.out.println("rakamSayisi = " + rakamSayisi);
        System.out.println("harfSayisi = " + harfSayisi);
     }

}
