package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista

		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String str = scan.nextLine();

        if (str.length() % 2 == 0){
            System.out.println(str.substring(str.length()/2));
        } else System.out.println("girilen string ikiye bolunemez");



    }
}
