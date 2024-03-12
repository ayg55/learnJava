package j100_javaProjects.P04;

public class Ogretmen extends Kisi { // Kisi parent class'a extend child pojo Class

    // fields
    private String sicinNo; // instance: obj variable
    private String bolum;

    // constructor...


    public Ogretmen() {
    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String sicinNo, String bolum) {
        super(adSoyad, kimlikNo, yas);
        this.sicinNo = sicinNo;
        this.bolum = bolum;
    }

    // getter setter


    public String getSicinNo() {
        return sicinNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    //toString

    @Override
    public String toString() {
        return super.toString() +
                "sicinNo='" + sicinNo + '\'' +
                ", bolum='" + bolum + '\'' ;
    }
}



