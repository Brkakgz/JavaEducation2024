import java.util.Scanner;

public class Deneme10 {
    public static void main(String[] args) {
        //0 girene kadar sayı alıyoruz.girilen tüm sayılardan tek ve çift olanları ayrı ayrı bul ortalama bul toplam bul

        Scanner scanner = new Scanner(System.in);
        int num;
        int toplam = 0, cift = 0, tek = 0, sayac = 0;
        do {
            System.out.println("Sayı Giriniz: ");
            num = scanner.nextInt();
            if (num == 0) {
                System.out.println("0'dan farklı sayı girdiniz, sonuçlar yazdırılıyor. Kapatılıyor....");
                break;
            }
            toplam = toplam + num;
            if (num % 2 == 0) {
                cift = cift + num;
            } else
                tek += num;


            sayac++;
        }

        while (num != 0);
//        while(true)
//        {
//            System.out.println("Sayı Giriniz: ");
//            int num = scanner.nextInt();
//            if(num==0)
//            {
//                System.out.println("0 girdiniz, sonuçlar yazdırılıyor. Kapatılıyor....");
//                break;
//            }
//            toplam=toplam+num;
//            if(num%2==0)
//            {
//                cift=cift+num;
//            }
//            else
//            {
//                tek +=num;
//            }
//            sayac++;
        System.out.println("Toplam: " + toplam);
        System.out.println("Cift: " + cift);
        System.out.println("Tek: " + tek);
        System.out.println("Ortalama: " + (double) toplam / sayac);
    }
}


