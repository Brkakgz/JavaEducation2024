package ReturnMethods;

import java.util.Scanner;

public class ReturnMethodsExample02 {
    //Büyüğü bulsun büyüğe 10 eklesin if else ile yap 10 eklemeyi mainde karşılaştırmayı yeni metodda yapsın
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1,sayi2;
        System.out.println("Sayı1 giriniz: ");
         sayi1= scanner.nextInt();
        System.out.println("Sayı2 giriniz: ");
         sayi2= scanner.nextInt();
        int sonuc=karsilastir(sayi1,sayi2); // gelecek olan sonucu bir değere atadım ki değeri kullanabileyim 15. satırda mesela
        System.out.println("Büyük olan +10 : "+(sonuc+10));
    }
    public static int karsilastir(int a, int b){
        if(a>b){
            return a;
        }
        else if(a<b){
            return b;
        }
        else{
            System.out.println("Büyük değer yoktur");
            return a; // ikiside aynı ya birini ver gitsin
        }
    }
}
