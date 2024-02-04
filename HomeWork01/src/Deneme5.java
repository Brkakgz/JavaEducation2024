import java.util.Scanner;

public class Deneme5 {
    public static void main(String[] args) {
        //0 girene kadar olan sayıları topla

        Scanner scanner = new Scanner(System.in);
        int toplam=0,sayac=0;
        // double toplam=0,sayac=0;
        while(true)
        {
            System.out.println("Sayı Giriniz: ");
            int num= scanner.nextInt();
            if(num==0)
            {
                break;
            }
            else {
                toplam=toplam+num;
                sayac++;
            }
        }

        System.out.println("Toplam: "+toplam);
        System.out.println("Ortalaması: "+(double)toplam/sayac); // (double)(toplam/sayac) yaparsak önce toplam/sayac yapıyor bu değer int olduğu için 7 veriyor sonra double dönüşümünü yapıyor 7.0 yazıyor. Yani işlem önceliği olmuş oluyor
        //System.out.println("Ortalaması: "+(toplam/sayac));

        System.out.println("--------");
        int a=50, b=6;
        System.out.println((double)a/b);
    }
}
