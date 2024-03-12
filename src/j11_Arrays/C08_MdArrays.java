package j11_Arrays;

public class C08_MdArrays {
    public static void main(String[] args) {
        //Task-> int arr[][]={
//                {3,5},//0. kat
//                {12,13,15},//1. kat
//                {103,107,111,121},//2. kat
//        };
//        array elamanları toplamını print eden code create ediniz.

        int arr[][]={
                {3,5},//0. kat
                {12,13,15},//1. kat
                {103,107,111,121},//2. kat
        };

        int total = 0;

        for (int kat = 0; kat < arr.length; kat++) {
            for (int daire = 0; daire < arr[kat].length; daire++) {
                total += arr[kat][daire];
            }
        }
        System.out.println("total = " + total);


    }
}
