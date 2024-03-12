package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz : ");
        String gender = scan.next();

        if (gender.equalsIgnoreCase("erkek")) {
            System.out.println("Lutfen Yasinizi giriniz : ");
            int age = scan.nextInt();
            if (age < 18) {
                System.out.println("Erkek Cocuk");
            } else System.out.println("Adam");
        } else if (gender.equalsIgnoreCase("kadin")) {
            System.out.println("Lutfen Yasinizi giriniz : ");
            int age = scan.nextInt();
            if (age < 18) {
                System.out.println("Kiz Cocuk");
            } else System.out.println("Kadin");
        }
    }
}































