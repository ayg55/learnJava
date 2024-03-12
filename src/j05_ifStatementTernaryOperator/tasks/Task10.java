package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /* Task->
         Kullanicidan 100 uzerinden notunu isteyin.
         Not’u harf sistemine cevirip yazdirin.
         50’den kucukse “D”,->1,2,3..49
         =50  <60 arasi “C”,->50,51,52,..59
         =60  <80 arasi “B”,->60,61,62,63..79
         =80’nin uzerinde ise “A”->80,81..100
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu 100 uzerinden giriniz : ");
        int score = scan.nextInt();

        if (score < 50 && score > 0) System.out.println("D");
        else if (score >= 50 && score < 60) System.out.println("C");
        else if (score >= 60 && score < 80) System.out.println("B");
        else if (score >= 80 && score <= 100) System.out.println("A");
        else System.out.println("Lutfen dogru aralikta bir not giriniz");










    }


}
