package j14_Varargs;

public class C02_Varargs_Array {
    public static void main(String[] args) {

        int arr[] = {10, 11, 36, 14, 41, 77, 46, 61, 20};
        // task01-> verilen arr elamanlarını toplamını print eden METHOD create ediniz

        System.out.println("arrSum(arr) = " + arrSum(arr));

        // task02-> task01 execute(run) eden varargs  METHOD create ediniz.
        System.out.println("varargsSum(10, 11, 36, 14, 41, 77, 46, 61, 20) = " + varargsSum(10, 11, 36, 14, 41, 77, 46, 61, 20));


    }

    private static int varargsSum(int... i) {
        int sum = 0;
        for (int each : i) {
            sum += each;
        }
        return sum;
    }

    private static int arrSum(int[] arr) { // int[] p'li meth int return type
        int sum = 0;
        for (int each : arr) {
            sum += each;
        }
        return sum;
    }
}
