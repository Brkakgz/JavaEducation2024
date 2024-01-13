import java.util.Scanner;

public class ArrayExample05 {
    public static void main(String[] args) {
        //0 sayısı girilene kadar sayıların toplamını veren program
       /* BU ŞEKİLDE DİZİ KULLANILABİLİR AMA DİZİ KULLAMANIN MANTIĞI KALMIYOR SÜREKLİ 0.İNDEX DEĞİŞİYOR
       Scanner scanner= new Scanner(System.in);
        int num1;
        int i=1;
        int[] numbers=new int[i];

        int toplam=0;
        do {
            i++;
            System.out.println("Sayı giriniz: ");

            num1= scanner.nextInt();
            if(num1==0)
            {
                System.out.println("Toplam: "+toplam);
                break;
            }
            else {
                numbers[0]=num1;
                toplam=toplam+numbers[0];

            }
        }
        while(num1!=0);

        */
        Scanner scanner = new Scanner(System.in);
        int toplam=0;
        int sayi;

        while(true){
            System.out.println("0'dan farklı Sayı Giriniz: ");
            sayi= scanner.nextInt();
            toplam=toplam+sayi;
            if(sayi==0)
            {
                System.out.println("0 sayısı girdiniz. Girilen sayıların toplamı hesaplanıyor...");
                break;
            }
        }
        System.out.println("0'a kadar girilen sayıların toplamı: "+toplam);
    }
}
