package For;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        //Kullanıcıdan girilen bir sayıya kadar çift sayıları ekrana yazdıran ve toplayan program
        Scanner scanner = new Scanner(System.in);
        int sayi, toplam=0,sayac=0;
        System.out.println("Sayi Giriniz:");
        sayi= scanner.nextInt();
        for(int i=1;i<=sayi;i++)
        {
            if(i%2==0) {
                System.out.println("Çift Sayı : "+i);
                toplam = toplam + i;
                sayac++;
            }

        }
        System.out.println("Toplam= " + toplam);
        System.out.println("Çift Sayıların Sayısı:"+sayac);
    }
}
