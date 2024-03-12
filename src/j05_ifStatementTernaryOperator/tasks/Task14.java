package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz (Erkek icin 'E', Kadin icin 'K' yaziniz");
        String gender=scan.next();


        if (gender.equalsIgnoreCase("K")){
            System.out.println("Lutfen yasinizi giriniz");
            int age=scan.nextInt();
            if (age>=60){
                System.out.println("Prim gununuzu giriniz");
                int primDay=scan.nextInt();
                if (primDay>6000){
                    System.out.println("Tebrikler Emekli olabilirsiniz");
                }else {
                    System.out.println("Hanimefendi emekli olmaniz icin "+(6000-primDay)+" prim gunune ihtiyaciniz var");
                }
            }else {
                System.out.println("Hanimefendi emekli olmaniza "+(60-age)+" yil var");
            }

        } else if (gender.equalsIgnoreCase("E")){
            System.out.println("Lutfen yasinizi giriniz");
            int age=scan.nextInt();
            if (age>=65){
                System.out.println("Prim gununuzu giriniz");
                int primDay=scan.nextInt();
                if (primDay>7000){
                    System.out.println("Tebrikler Emekli olabilirsiniz");
                }else {
                    System.out.println("Beyefendi emekli olmaniz icin "+(6000-primDay)+" prim gunune ihtiyaciniz var");
                }
            }else {
                System.out.println("Beyefendi emekli olmaniza "+(60-age)+" yil var");
            }

        } else System.out.println("Hatali giris yaptin");
}

}
