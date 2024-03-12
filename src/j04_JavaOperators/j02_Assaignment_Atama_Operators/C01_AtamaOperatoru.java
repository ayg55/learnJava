package j04_JavaOperators.j02_Assaignment_Atama_Operators;

import com.sun.tools.javac.Main;

public class C01_AtamaOperatoru {

    //    =         x = 8      x = 8
    //    +=        x += 3     x = x + 3
    //    -=        x -= 3     x = x - 3
    //    *=        x *= 3     x = x * 3
    //    /=        x /= 3     x = x / 3
    //    %=        x %= 3     x = x % 3

    public static void main(String[] args) {

        int saimYas=48;
        System.out.println("saimYas = " + (saimYas+5)); //Atama yapilmadigi icin saim yas degeri degismedi..
        System.out.println("saimYas = " + saimYas);
        System.out.println("saimYas = " + (saimYas+=5)); //+= demek once ekle sonra ata anlami vardir. degeri degistirir.
        System.out.println("saimYas = " + saimYas);

        System.out.println(saimYas%=5);
        System.out.println("saimYas = " + saimYas);




    }
}
