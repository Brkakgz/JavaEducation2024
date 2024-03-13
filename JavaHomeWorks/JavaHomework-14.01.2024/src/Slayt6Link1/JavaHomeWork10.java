package Slayt6Link1;

import java.util.Scanner;

public class JavaHomeWork10 {
    public static void main(String[] args) {
        //Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed.
        // The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate.

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("İlk sayıyı giriniz: ");
            int num1 = scanner.nextInt();
            System.out.print("ihinci sayıyı giriniz: ");
            int num2 = scanner.nextInt();
            System.out.println("Sayıların toplamı: "+(num1+num2));
            System.out.println("İşlemi Tekrar Yapmak için 1, Çıkmak için 0 Giriniz");
            int num3 = scanner.nextInt();
            if(num3==0) {
                System.out.println("Çıkış Yapılıyor ...");
                break;
            }
            else if (num3==1){
                System.out.println("Lütfen Sayıları Tekrar Giriniz: ");
            }
            else {
                System.out.println("Hatalı giriş yaptınız program kapatılıyor...");
                break;
            }
        }
        while(true);
    }
}
