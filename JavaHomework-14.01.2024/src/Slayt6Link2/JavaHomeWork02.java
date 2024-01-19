package Slayt6Link2;

import java.util.Scanner;

public class JavaHomeWork02 {
    //Kullanıcının Girdiği Sayı Kadar Olan Sayıları Toplayan Program, ekstra metodlu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç Adet Sayı Girmek İstiyorsunuz: ");
        int num1 = scanner.nextInt();
        int sonuc= toplam(num1);
        System.out.println("Girdiğiniz Sayıların Toplamı:" + sonuc);

    }
    public static int toplam (int num1){
        int toplam=0;
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<=num1;i++)
        {
            System.out.print(i+". sayıyı giriniz: ");
            int num3 = scanner.nextInt();
            toplam=toplam+num3;

        }
        return toplam;
    }
}
