package j14_Varargs;

public class C01_Varargs {

     /*
      VARARGS :diva...  :)
      var----variety: cesitlilik args---arguments
      SYNTAX ->
      mathodName(parametre1,parametre2, dataType... dataName) {
      method body....

      }

       1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISSS -> Diva en son sahne alır
    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS -> diva tek olur.iki diva bir ipte yurumez

         Gunun TRICK'i  köşesinde böyün :
         Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
         ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli...
*/

    public static void main(String[] args) {

        int number1 = 15;
        int number2 = 34;
        int number3 = 59;
        int number4 = 38;

        // task01-> verilen 2 int variable toplamını print eden METHOD create ediniz..

        System.out.println("** Task 01 **");

        sum(number1,number2);
        sum(number2,number4);
        sum(99,number3);

        // task02-> verilen 3 int variable toplamını print eden METHOD create ediniz..
        System.out.println("   ***  task02   ***   ");

        sum(number1,number3,135);
        sum(571,number4,1);
        sum(1907,number4,number2);

        // task03-> verilen 5 int variable toplamını print eden METHOD create ediniz.
        System.out.println("   ***  task03   ***   ");
        
        sum(3,6,number1,34,number4);

        // task04-> .verilen String variable'rın  en fazal karakter bulunduranı  print eden METHOD create ediniz..
        System.out.println("   ***  task04   ***   ");

        enUzunKelime("JavaZADE","JavvvaNUR","JavaCAN");
        enUzunKelime("Enes","Ahmet","Halit","Abdurrahman","Semra Yaren Hanim");


    }

    private static void enUzunKelime(String... str) {
        String uzunStr = "";
        for (String each : str) {
            if (uzunStr.length() < each.length()) {
                uzunStr = each;
            }
        }
        System.out.println("uzunStr = " + uzunStr);
    }

    private static void sum(int... i) {
        int sum = 0;;
        for (int each : i) {
            sum += each;
        }
        System.out.println("sum = " + sum);
    }

    private static void sum(int num1, int num2, int number3) { // 2p'li method
        System.out.println("Elemanlarin Toplami : " + (num1 + num2));
    }
    private static void sum(int num1, int num2) { // 3p'li method
        System.out.println("Elemanlarin Toplami : " + (num1 + num2));
    }




}
