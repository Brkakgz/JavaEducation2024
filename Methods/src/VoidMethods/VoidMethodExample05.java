package VoidMethods;

import java.util.Scanner;

public class VoidMethodExample05 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Sayı1 Giriniz: ");
        int num1= scanner.nextInt();
        System.out.println("Sayı2 Giriniz: ");
        int num2= scanner.nextInt();
        System.out.println("Toplama için 1, Çıkarma için2 Çarpma için 3, Bölmeiçin 4 seçiniz");
        do {
            int sec= scanner.nextInt();
            if (sec == 1) {
                topla(num1, num2);
                break;
            } else if (sec == 2) {
                cikar(num1, num2);
                break;
            } else if (sec == 3) {
                carp(num1, num2);
                break;
            } else if (sec == 4) {
                bol(num1, num2);
                break;
            } else {
                System.out.print("Yanlış Sayi Girdiniz.Seçimi yeniden 1ile4 arasında giriniz: ");
            }
        }
           // while(sec<=0 && sec>4); // Bu bir boolean değer değil ki aq mal mısın ?
             while(true);

    }
    public static void topla(int sayi1,int sayi2){
//        int toplama=0;
//        toplama=sayi1+sayi2;
//        System.out.println("Toplamı: "+toplama); bunlar yerine
        System.out.println("Toplamı: "+(sayi1+sayi2)); // yapılabilirdi
    }
    public static void cikar(int sayi1,int sayi2){
        int cikarma=0;
        cikarma=sayi1-sayi2;
        System.out.println("Çıkarımı: "+cikarma);

    }
    public static void carp(int sayi1,int sayi2){
        int carpma=0;
        carpma=sayi1*sayi2;
        System.out.println("Çarpımı: "+carpma);

    }
    public static void bol(int sayi1,int sayi2){
//        int bolme=0;
//        bolme=sayi1/sayi2;
        System.out.println("Bölümü: "+(double)(sayi1/sayi2)); // yapılabilri
    }
}
