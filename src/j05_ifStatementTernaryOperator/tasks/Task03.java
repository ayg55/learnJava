package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
		/*
		Task->
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum"
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl"
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl" print eden code create ediniz.
		 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir yil giriniz : ");
        int year = scan.nextInt();

        if (year % 1000 == 0) {
            System.out.println("<Milenyum");
        } else if (year % 100 == 0) {
            System.out.println("Yuzyil");
        } else if (year % 10 == 0) {
            System.out.println("on Yil");
        }


    }
}

	

