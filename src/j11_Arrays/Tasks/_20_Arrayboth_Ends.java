package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class _20_Arrayboth_Ends {

    public static void main(String[] args) {

     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        //Kodu aşağıya yazınız..

        Scanner scan = new Scanner(System.in);
        System.out.println("Array in elemanlarini giriniz (elemanlarin aralarinda bir bosluk birakiniz) : ");
        String input = scan.nextLine();
        String[] arr = input.split(" ");
        String[] newArr = {(arr[0]),(arr[arr.length - 1])};
        System.out.println("Arrays.toString(newArr) = " + Arrays.toString(newArr));


    }
}