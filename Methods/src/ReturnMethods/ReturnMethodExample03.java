package ReturnMethods;

import java.util.Scanner;

public class ReturnMethodExample03 {
    public static void main(String[] args) {
        //Girilen sayıya kadar olan sayıların toplamını bulan uygulamayı return typle ile yapın toplamı döndürsün
        Scanner scanner = new Scanner(System.in);
        int sayi1;
        System.out.println("Sayı giriniz: ");
        sayi1=scanner.nextInt();
        int sonuc=toplam(sayi1);
        System.out.println(sayi1+" değerine kadar olan değerlerin toplamı: "+sonuc);
    }
    public static int toplam(int a){ // mesela bu soru için n dersek 1'den n'e kadar olduğu anlaşulur gibi
        int toplam=0;
        for(int i=1;i<=a;i++)
        {
            toplam=toplam+i;
        }
        return toplam;

    }
    /*
    public static void main(String[] args) {
    // 1 den 100 e kadar girilen sayıya kadar olan sayıların toplamını bulan uygu return type ile yap.
    System.out.println(topla(1,100)); //1 from, 100 to değerine gider burdan buraya kadar gibi güzel oldu bendekine bakan bu ne aq der ama çalışır bu okunaklı
}

public static int topla(int from, int to) {

    int toplam = 0;

    for(int i = from; i <= to; ++i)
    {
        // toplam = toplam + i;
        toplam += i;
    }
    System.out.println("Toplam = " + toplam);
    return toplam;

}
     */
}
