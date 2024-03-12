package j100_javaProjects.P04;

public class Ogrenci extends Kisi{
    // fields
    private String OgrenciNumara; // instance: obj variable
    private String sinif;

    // constructor...


    public Ogrenci() {
    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String OgrenciNumara, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.OgrenciNumara = OgrenciNumara;
        this.sinif = sinif;
    }

    // getter setter


    public String getOgrenciNumara() {
        return OgrenciNumara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    //toString

    @Override
    public String toString() {
        return super.toString() +
                "OgrenciNumara='" + OgrenciNumara + '\'' +
                ", sinif='" + sinif + '\'' ;
    }
}
