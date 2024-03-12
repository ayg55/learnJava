package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Task->
        Trafik cezasının değerini hesaplayın code create ediniz
45 hız sınırıdır.

Eğer hızınız 55-74 arasında ise:
Ceza 100 $'dır.

Eğer hızınız 75 - 84 arasında ise:
Ceza 150 $'dır.

Eğer hızınız 85 -94 arasında ise:
Ceza 320 $'dır.

Eğer hızınız 94'den daha fazla ise:
Ceza 500 $'dır.

ve ayrıca,
Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


-----------------------------------------


Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);

        System.out.println("Speed : ");
        int currentSpeed = scan.nextInt();
        System.out.println("Have you a Driver Licence? ( true of false ) : ");
        boolean isDriverLicenceAvailable = scan.nextBoolean();

//Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ. ( ama yukaridaki kod eksik :)

        int penaltySpeed = 0;

        if ((currentSpeed >= 55) && (currentSpeed <= 74)) {
            penaltySpeed = 100;
        } else if ((currentSpeed >= 75) && (currentSpeed <= 84)) {
            penaltySpeed = 150;
        } else if ((currentSpeed >= 85) && (currentSpeed <= 94)) {
            penaltySpeed = 320;
        } else if (currentSpeed >= 95) {
            penaltySpeed = 500;
        }
        if (isDriverLicenceAvailable == false) {
            penaltySpeed = (penaltySpeed + 200);
        }
        System.out.println("Total ticket price is = " + penaltySpeed + " $");





    }
}


