package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Bir metin giriniz");
		String text = scan.nextLine();

		int counter = 0;

		for (int i = 0; i < text.length(); i++) counter += Character.isDigit(text.charAt(i)) ? 1 : 0;

		System.out.println("Rakam Sayisi = " + counter);

	}
}
