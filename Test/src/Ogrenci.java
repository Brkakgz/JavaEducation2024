public class Ogrenci {
    private String adSoyad;
    private String sehir;
    private int numara;
    private int sinif;

    public void setAdSoyad(String adSoyad) {
        this.adSoyad=adSoyad;
    }
    public void setSehir(String sehir) {
        this.sehir=sehir;
    }
    public void setNumara(int numara) {
        this.numara=numara;
    }
    public void setSinif(int sinif) {
        this.sinif=sinif;

    }
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci();

        ogrenci1.setAdSoyad("Furkan Bodur");
        ogrenci1.setSehir("Ankara");
        ogrenci1.setNumara(2179399);
        ogrenci1.setSinif(1);

        System.out.println(ogrenci1.adSoyad);
    }
}

