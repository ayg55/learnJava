package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class _19_school_grade {

    public static void main(String[] args) {

        /*  Task->
        Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */


        // Code start here DO NOT CHANGE THE CODE BEFORE THIS LINE

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter score of quiz : ");
        int qS = scan.nextInt();
        System.out.println("Please enter score of mid term : ");
        int mS = scan.nextInt();
        System.out.println("Please enter score of final : ");
        int fS = scan.nextInt();

        int gS = ((qS + mS + fS) / 3);

        if ((gS >= 90) && (gS <= 100)) {
            System.out.println("Your grade is A");
        } else if ((gS >= 70) && (gS < 90)) {
            System.out.println("Your grade is B");
        } else if ((gS >= 50) && (gS < 70)) {
            System.out.println("Your grade is C");
        } else if (gS < 50) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Hatali bir Puan girdiniz");
        }



    }
}
