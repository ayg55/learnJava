package j14_Varargs.Tasks;

public class Task02 {
    public static void main(String[] args) {

        /*
        Task -> Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.
        */

        System.out.println("sumMultiply(2,24,23,38,21,59,26,10) = " + sumMultiply(2, 24, 23, 38, 21, 59, 26, 10));

    }

    private static int sumMultiply(int multiply, int... sumN) {
        int sum = 0;
        for (int w : sumN) {
            sum += w;
        }
        return  multiply * sum;
    }
}
