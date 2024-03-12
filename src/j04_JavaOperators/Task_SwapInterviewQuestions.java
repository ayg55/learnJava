package j04_JavaOperators;

public class Task_SwapInterviewQuestions {

    /*
     TASK :
     Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
     code create edip print ediniz.
     a) 3. bir variable kulanarak
     b) 3. bir variable kullanmadan

   input    : sayi1=20 ve sayi2=34;
output  :  sayi1=34 ve sayi2=20

      */

    public static void main(String[] args) {

        int sayi1=20;
        int sayi2=34;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        int temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);


        int num1=20;
        int num2=34;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1+=num2; // yada num1=num1+num2

        num2=num1-num2;
        num1-=num2; //num1=num1-num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);



    }
}
