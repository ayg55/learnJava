package j11_Arrays.Tasks;

public class Task19 {
    public static void main(String[] args) {
        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        combineTo2Arrays(arr1, arr2);

    }

    private static void combineTo2Arrays(int[][] array1, int[][] array2) {
        for (int i = 0; i < (Math.min(array1.length, array2.length)); i++) {
            for (int j = 0; j < Math.min(array1[i].length, array2[i].length); j++) {
                System.out.print((array1[i][j] + array2[i][j]) + " ");
            }
        }
    }
}
