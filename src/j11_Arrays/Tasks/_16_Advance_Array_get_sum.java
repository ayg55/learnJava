package j11_Arrays.Tasks;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        String price = "$12 $23 $10 $2 $5 $2";

        int sum = 0;

        String[] arr = price.replaceAll(" ","").split("\\$");
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println("sum = " + sum);


        //Kodu aşağıya yazınız.


    }
}