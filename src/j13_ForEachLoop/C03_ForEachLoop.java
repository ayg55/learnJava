package j13_ForEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        // task -> array elamanlarının çarpımını print eden code create ediniz...-> with for-each

        int arr[][] = {
                {2, 3},// 0. kat
                {4}, // 1. kat
                {5, 6,7} // 2. kat
        };

        int multiply = 1;

        for (int[] each1 : arr) {
            for (int each2 : each1) {
                multiply *= each2;
            }
        }
        System.out.println("multiply = " + multiply);

    }
}
