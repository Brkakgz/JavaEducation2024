package Slayt6Link2;

import java.util.Scanner;

public class JavaHomeWork01 {
    //Kullanıcının Girdiği Aralıktaki Tek Sayıları Yazdıran Java Programı
    //Ekstra olarak yeni bir metod ekledim
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int num1= scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int num2= scanner.nextInt();
        int toplam= control(num1,num2);
        System.out.println("Aralıktaki Tek Sayıların Toplamı: "+toplam);

    }
    public static int control(int num1, int num2){
        int toplama=0;
        for(int i=num1;i<=num2;i++){
            if(i%2!=0)
            {
                System.out.println("Tek Sayınız: "+i);
               toplama=toplama+i;
            }
        }
        return toplama;
    }
}