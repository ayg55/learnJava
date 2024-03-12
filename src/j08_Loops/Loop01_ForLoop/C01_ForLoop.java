package j08_Loops.Loop01_ForLoop;

public class C01_ForLoop {

    public static void main(String[] args) {

        //forloop -> tekrarlayan sabit aksiyonlar icin tanimlanan code blogudur.

        // task-> 41 kere "maaşallah" print eden code create ediniz.
/*
        System.out.println("Masaallah");
        System.out.println("Masaallah");
        System.out.println("Masaallah");
        System.out.println("Masaallah");
        System.out.println("Masaallah");
        */ //amele coding

        for (int i = 0; i < 41; i++) {
            System.out.println(i + 1 + "Masaallah"); //her tekrarda alinacak aksiyon
        }

        System.out.println("JavaCan'lara selam");

        // task02-> 2 basamalı tek sayıları aynı satıra aralarında boşluk ile print eden code create ediniz.

        for (int i = 11; i <= 99 ; i+=2) {
            System.out.print(i +" ");

        }
        System.out.println("****");

        for (int i = 0; i < 100; i++) {
            if (i >= 10 && i % 2 != 0) {
                System.out.print(i + " ");
            }

        }



























    }

}
