package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task10 {
    /*
    Task->
    Write a Java program to convert temperature from Fahrenheit to Celsius degree.
    formula :  c = (f-32)*5/9
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Type the fahrenheit temperature you will to convert to celsius : ");
        double tempF=scan.nextDouble();

        System.out.println(""+tempF+" degrees fahrenheit is equal to "+((tempF-32)*5/9)+" degrees celsius.");


    }


}
