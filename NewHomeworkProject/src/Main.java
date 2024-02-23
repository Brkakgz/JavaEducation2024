import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelimenizi giriniz: ");
        String sozcuk = scanner.next();
        System.out.print("Yeni sözcük ne kadar uzunlukta olsun: ");
        int sozcukSize = scanner.nextInt();
        int sayac=0,k=0;

        String sozcuk2 ="" ;
        for(int i=0;i<sozcukSize;i++)
        {
                sozcuk2 = sozcuk2 + sozcuk;
        }
        char[] sozcuk2Array = sozcuk2.toCharArray();
        for(int i=0;i<sozcukSize;i++)
        {
            if(sozcuk2Array[i]=='a') {
                sayac++;
            }
        }
        System.out.println(sayac+" tane a veya A harfi bulundu!");
    }
}