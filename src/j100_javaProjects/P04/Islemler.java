package j100_javaProjects.P04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static String kisiTuru; // istenen methoda call edilebilmesi icin static tanimlandi.
    static Scanner input = new Scanner(System.in);
    static List<Ogretmen> ogretmenList = new ArrayList<>(); // ogretmen obj depolayacak bos list tanimlandi
    static List<Ogrenci> ogrenciList = new ArrayList<>(); // ogrenci obj depolayacak bos list tanimlandi

    public static void girisPaneli() {
        System.out.println("**********************************      \nOGRENCI VE OGRETMEN ANA MENU \n**********************************\n1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS \nLutfen yapmak istediginiz islemi giriniz : ");
        String islemSecimi = input.next().toUpperCase();
        switch (islemSecimi) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Hatali giris yaptiniz tekrar deneyiniz");
                girisPaneli(); // recursive meth -> cisss!!! cok kullanmayizz onerilmez ilerde gorucez cozumunu
        }

    }

    public static void islemMenu() {
        System.out.println("Sectiginiz kisi turu: " + kisiTuru + "\nISLEM MENU\nLutfen asagidaki islemlerden tercih yapiniz.\n"
                + "*********** " + kisiTuru + " ISLEMLER ************\n 1-EKLEME\n 2-ARAMA\n 3-LISTELEME\n 4-SILME\n 0-ANA MENU \n" +
                "Islem Tercihinizi giriniz : ");
        String islemTercihi = input.next();
        switch (islemTercihi) {
            case "1":
                ekle();
                break;
            case "2":
                ara();
                break;
            case "3":
                listele();
                break;
            case "4":
                sil();
                break;
            case "0":
                girisPaneli();
                break;
            default:
                System.out.println("Hatali giris yaptiniz tekrar deneyiniz");

        }
    }

    private static void sil() {
        System.out.println("     ***        " + kisiTuru + " SILME sayfasi           ***      ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println("silinecek OGRENCI kimlikNO giriniz : ");
            String silinecekOgrcKimlikNO = input.next();
            for (Ogrenci k : ogrenciList) {
                if (k.getKimlikNo().equals(silinecekOgrcKimlikNO)) {
                    ogrenciList.remove(k);
                    System.out.println("Silinecek ogrenci listemizden SILINDI");
                    break;
                } else {
                    System.out.println("Aradiginiz ogrenci listemizde kayitli degil");
                    islemMenu();
                }
            }

        } else {
            System.out.println("     ***        " + kisiTuru + " SILME sayfasi           ***      ");
            if (kisiTuru.equalsIgnoreCase("OGRETMEN")) {
                System.out.println("silinecek OGRETMEN kimlikNO giriniz : ");
                String silinecekOgrtKimlikNO = input.next();
                for (Ogretmen k : ogretmenList) {
                    if (k.getKimlikNo().equals(silinecekOgrtKimlikNO)) {
                        ogretmenList.remove(k);
                        System.out.println("Silinecek ogretmen listemizden silindi");
                        break;
                    } else {
                        System.out.println("Aradiginiz ogretmen listemizde kayitli degil");
                    }
                }
                islemMenu();
            }
        }
    }

    private static void listele() {
        System.out.println("     ***        " + kisiTuru + " LISTELEME sayfasi           ***      ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println(ogrenciList);
        } else {
            System.out.println(ogretmenList);
        }
        islemMenu();
    }

    private static void ara() {
        System.out.println("     ***        " + kisiTuru + " ARAMA sayfasi           ***      ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println("aradiginiz OGRENCI kimlikNO giriniz : ");
            String arananOgrcKimlikNO = input.next();
            for (Ogrenci k : ogrenciList) {
                if (k.getKimlikNo().equals(arananOgrcKimlikNO)) {
                    System.out.println("Aradiginiz ogrenci " + k.getAdSoyad() + " listemizde kayitli");
                    break;
                } else {
                    System.out.println("Aradiginiz ogrenci listemizde kayitli degil");
                    islemMenu();
                }
            }

        } else {
            System.out.println("     ***        " + kisiTuru + " ARAMA sayfasi           ***      ");
            if (kisiTuru.equalsIgnoreCase("OGRETMEN")) {
                System.out.println("aradiginiz OGRETMEN kimlikNO giriniz : ");
                String arananOgrtKimlikNO = input.next();
                for (Ogretmen k : ogretmenList) {
                    if (k.getKimlikNo().equals(arananOgrtKimlikNO)) {
                        System.out.println("Aradiginiz ogretmen " + k.getAdSoyad() + " listemizde kayitli");
                        break;
                    } else {
                        System.out.println("Aradiginiz ogretmen listemizde kayitli degil");
                    }
                }
                islemMenu();
            }
        }
    }

    private static void ekle() {
        System.out.println("     ***        " + kisiTuru + " EKLEME sayfasi           ***      ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println("OGRENCI ad-soyad giriniz : ");
            input.nextLine();//dummy
            String adSoyad = input.nextLine();
            System.out.println("OGRENCI kimlikNO giriniz : ");
            String kimlikNO = input.nextLine();
            System.out.println("OGRENCI yas giriniz : ");
            int ogrncYas = input.nextInt();
            System.out.println("OGRENCI numara giriniz : ");
            String ogrcNo = input.next();
            System.out.println("OGRENCI sinif giriniz : ");
            String sinif = input.next();

            Ogrenci ogrc = new Ogrenci(adSoyad, kimlikNO, ogrncYas, ogrcNo, sinif);
            ogrenciList.add(ogrc);
            System.out.println("Ogrencini " + ogrc.getAdSoyad() + " basari ile eklenmistir." +
                    "\nOGRENCI ISLEM MENUYE yonlendiriliyorsunuz...");
            islemMenu();
        } else {
            System.out.println("OGRETMEN ad-soyad giriniz : ");
            input.nextLine();//dummy bunun nedeni su: next line dan once(string)(linedan kaynaklaniyor aslinda hata) kullanilan inputlarda kullanilirsa bu hata olusuyor ayni sey saniyor ikisini. ama next kullanilirsa bu hata olmaz.
            // nextLine çağrısı hemen öncesinde bir input.nextLine() kullanarak buffer'ı temizleyebilirsiniz. Örneğin, ekleme metodunda şu değişikliği yapabilirsiniz:
            String adSoyad = input.nextLine();
            System.out.println("OGRETMEN kimlikNO giriniz : ");
            String kimlikNO = input.next();
            System.out.println("OGRETMEN yas giriniz : ");
            int ogrtYas = input.nextInt();
            System.out.println("OGRETMEN sicilNo giriniz : ");
            String sicilNo = input.next();
            System.out.println("OGRETMEN bolumunu giriniz : ");
            String bolum = input.next();

            Ogretmen ogrt = new Ogretmen(adSoyad, kimlikNO, ogrtYas, sicilNo, bolum);
            ogretmenList.add(ogrt);
            System.out.println("Ogretmenin " + ogrt.getAdSoyad() + " basari ile eklenmistir." +
                    "\nOGRETMEN ISLEM MENUYE yonlendiriliyorsunuz...");
            islemMenu();
        }
    }

    private static void cikis() {
        System.out.println("Agam yine bekleriz SELAMETLEEE");
        System.exit(0);
    }
}
