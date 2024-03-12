package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
   Task->  Saati saniyeye çeviren  method create ediniz
    */
        Scanner scan = new Scanner(System.in);

        System.out.println("Saniyeye cevirmek istediginiz saati giriniz");
        int hour = scan.nextInt();

        int second = hourToSecond(hour);

        System.out.println(second);



    }//main sonu

    private static int hourToSecond(int hour) {
        return hour * 3600;
    }

}// Class sonu
