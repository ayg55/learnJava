package j15_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        // LocalTime  -> sadece saat-dakika-saniye datatlarını tutar(stored)

        LocalTime now = LocalTime.now();
        // olustururken new kullanilmaz.
        System.out.println("now = " + now);
        System.out.println("now.getHour() = " + now.getHour());
        System.out.println("now.getNano() = " + now.getNano());
        System.out.println("now.getMinute() = " + now.getMinute());
        System.out.println("now.getSecond() = " + now.getSecond());


        LocalTime hour1 = LocalTime.of(9,43,21,1907);
        LocalTime hour2 = LocalTime.of(9,43);
        LocalTime hour3 = LocalTime.of(19,10,21);
        //tanimlanan herhangi bir time oncesi -> plus , sonrasi -> minus meth ile gidilir.

        System.out.println("now.plusMinutes(36).minusHours(12) = " + now.plusMinutes(36).minusHours(12));
        LocalTime loopStart = LocalTime.now();
        System.out.println("loopStart.getNano() = " + loopStart.getNano());
        int sum = 0;
        for (int i = 0; i < 10000; i++) {
            sum+=i;
        }
        LocalTime finishLoop = LocalTime.now();
        System.out.println("finishLoop.getNano() = " + finishLoop.getNano());

        System.out.println("Loop run hizi : " + (finishLoop.getNano() - loopStart.getNano()));

    }
}
