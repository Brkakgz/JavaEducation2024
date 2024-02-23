public class Main2 {
    static int repeatedString(String str, int n) {

        int aSayisi = 0;

        int metinUzunlugu = str.length();

        for (int i = 0; i < metinUzunlugu; i++) {
            if (str.charAt(i) == 'a') {
                aSayisi++;
            }
        }

        int tamSayiTekrarlar = n / metinUzunlugu;
        int kalanKarakterTekrarlar = n % metinUzunlugu;

        aSayisi *= tamSayiTekrarlar;

        for (int i = 0; i < kalanKarakterTekrarlar; i++) {
            if (str.charAt(i) == 'a') {
                aSayisi++;
            }
        }
        return aSayisi;
    }

    public static void main(String[] args) {

        String string = "abcabcaababa";

        int n = 20;

        int sonuc = repeatedString(string, n);

        System.out.println("Girilen metin ve sayı'ya göre " + sonuc + " adet 'a' harfi bulunmaktadır.");
    }
}
