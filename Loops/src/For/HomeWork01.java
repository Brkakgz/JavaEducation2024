package For;

public class HomeWork01 {
    public static void main(String[] args) {
       //1'den 10'a kadar olan sayıları yazdırın 1 ve10 dahil
        int toplam=0;
        for(int sayi=1;sayi<=10;sayi++)// Sayının tanımı ve değeri burda olursa iyi olur herkes böyle yapıyormuş. İş hayatında böylesi daha iyiymiş.
        {
            toplam=toplam+sayi;
        }
        System.out.println("Toplam="+toplam);
    }
}
