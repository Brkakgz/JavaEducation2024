import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelimenizi giriniz: ");
        String sozcuk = scanner.next();
        System.out.print("Yeni sözcük ne kadar uzunlukta olsun: ");
        int sozcukSize = scanner.nextInt();
        int sayac=0;

        String sozcuk2 ="" ;
    /*    for(int i=0;i<sozcukSize;i++)
        {
                sozcuk2 = sozcuk2 + sozcuk;
        }
        
        char[] yeniSozcukArray = sozcuk2.toCharArray();

        for(int i=0;i<sozcukSize;i++)
        {
            if(yeniSozcukArray[i]=='a') {
                sayac++;
            }
        }
     */

        //Üstte yorum satırı olan ve bu aynı sonucu verecektir.
        for(int i=0;i<sozcukSize;i++)
        {
            sozcuk2 = sozcuk2 + sozcuk;
            if(sozcuk2.charAt(i)=='a' || sozcuk2.charAt(i)=='A') {
                sayac++;
            }
            System.out.println(i+1+". harf: "+sozcuk2.charAt(i));
        }
        System.out.println(sayac+" tane a veya A harfi bulundu!");
    }
}