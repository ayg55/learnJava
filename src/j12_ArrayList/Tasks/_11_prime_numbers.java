package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11_prime_numbers {
    static Scanner scan = new Scanner(System.in);

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {
        System.out.println("Hangi sayiya kadar olan asal sayilari ogrenmek istiyorsunuz : ");
        int untilNumber = scan.nextInt();

        List<Integer> primeNumbers = primeNumbers((untilNumber));
        System.out.println(primeNumbers.size() + " tane asal sayi vardir. Bunlar : " + primeNumbers);


    }

    private static List<Integer> primeNumbers(int untilNumber) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i < untilNumber; i++) {
            if (isPrimeNumber(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}



