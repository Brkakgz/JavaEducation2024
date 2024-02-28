import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelimenizi giriniz: ");
        String sozcuk = scanner.next();
        System.out.print("Yeni sözcük ne kadar uzunlukta olsun: ");
        int sozcukSize = scanner.nextInt();
        int sayac=0;

        String sozcuk2 ="" ;
        for(int i=0;i<sozcukSize;i++)
        {
            sozcuk2 = sozcuk2 + sozcuk;
            if(sozcuk2.charAt(i)=='a') {
                sayac++;
            }
        }

        System.out.println(sayac+" tane a veya A harfi bulundu!");
    }
}

