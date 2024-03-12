package j09_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
        // Task -> Girilen String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
        Scanner scan=new Scanner(System.in);
        String pin="JavvaNur";
        int grsHakki=3;
        while (true){
            System.out.println("Pin kodunu giriniz");
            String kulPin= scan.next();
            if (kulPin.equals(pin)){
                System.out.println("Pin gecerli HOSGELDINIZ");
                break;
            }else {
                grsHakki--;
                if (grsHakki==0){
                    System.out.println("Hakkin kalmadi telefoncuya git");
                    break;
                }
                System.out.println("hatali pin girdiniz. Tekrar deneyin");
                System.out.println(grsHakki+" tane deneme hakkin kaldi");
            }
        }
    }
}
