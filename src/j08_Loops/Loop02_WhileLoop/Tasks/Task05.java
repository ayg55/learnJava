package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Isminizi giriniz");
		String isim = scan.nextLine().replace(" ","");
		char ilkHarf = isim.charAt(0);
		System.out.println("Soyisminizi giriniz");
		String soyisim = scan.nextLine();
		char sonHarf = soyisim.charAt(soyisim.length() - 1 );

		int i = 0;


		while (i <= isim.length() - 1) {
			System.out.print(isim.charAt(i) + " ");
			i++;
		}
		i=0;
		while (i <= soyisim.length() - 1) {
			System.out.print(soyisim.charAt(i) + " ");
			i++;
		}






	}

}
