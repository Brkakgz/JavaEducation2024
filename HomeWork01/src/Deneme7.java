import java.util.Scanner;

public class Deneme7 {
    public static void main(String[] args) {
        //kullanıcıdan kaç adet sayı gireceğini al ve sayı girdirt ve sonra bunları diziye ata, sonra bu sayıların ortalaması toplamı tek çift değerleri yapan prog.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç Adet Sayı Gireceksiniz: ");
        int num1= scanner.nextInt();
        double[] dizi = new double[num1];

        int sayac=0;
        do {
            System.out.print((sayac+1)+".sayıyı giriniz: ");
            double num2= scanner.nextDouble();
            dizi[sayac]=num2;
            sayac++;
        }
        
        while(sayac<num1);

        double toplam=0,ortalama=0;
        for(int i=0;i<num1;i++)
        {
            toplam=toplam+dizi[i];
        }
        ortalama=toplam/num1;
        System.out.println("Toplam= "+toplam);
        System.out.println("Ortlama= "+ortalama);

        int sayac2=0,sayac3=0;
        for(int i=0;i<num1;i++)
        {
            if(dizi[i]%2==0 || dizi[i]==0)
            {
                System.out.println(dizi[i]+". değeri çifttir.");
                sayac2++;
            }
            else
            {
                System.out.println(dizi[i]+". değeri tektir.");
                sayac3++;
            }
        }
        System.out.println("Dizideki çift sayıların sayısı: "+sayac2);
        System.out.println("Dizideki çift sayıların sayısı: "+sayac3);
    }
}
