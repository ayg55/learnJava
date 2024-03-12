package j11_Arrays.Tasks;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
         verilen Stringde bulunan rakamların toplamını print eden parametreli METHOD create ediniz.
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */


        String str = "ade1r4d3";
        int sum = sumOfNumbersInString(str);
        System.out.println("sum = " + sum);


    }

    private static int sumOfNumbersInString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.valueOf(String.valueOf(str.charAt(i)));
            }
        }
        return sum;
    }


}

