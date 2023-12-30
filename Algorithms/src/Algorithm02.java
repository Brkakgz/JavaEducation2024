import java.util.Scanner;

public class Algorithm02 {
    public static void main(String[] args) {
        //Sıfırdan farklı girilen sayıları toplayan prog
        int num1,num2,toplam;
        Scanner reader =new Scanner(System.in);
        System.out.println("Sıfırdan farklı birinci sayıyı giriniz:");
        num1= reader.nextInt();
        System.out.println("Girilen birinci sayı:" +num1);

        System.out.println("Sıfırdan farklı ikinci sayıyı giriniz:");
        num2= reader.nextInt();
        System.out.println("Girilen birinci sayı:" +num2);

        //if(num1==0 || num2==0) num1==0 veya num2==0 anlamına gelir tek seferde yazılır daha rahat kolay olabilir tek if içerisinde iki sorgu yapılmış olur
        //{
        //    System.out.println("Maalesef 0 girdiniz. Uygulama Kapatılıyor");
        //    System.exit( status :-1);
        //}


        //Buradaki if yapılarını sayıları girdikten sonra yaparsak ilk girilen sayı0 olursa gerisini işlemez ve hızlı olur
        if(num1==0 )
        {
            System.out.println("Maalesef 0 girdiniz. Uygulama Kapatılıyor");
            System.exit( -1 );
        }
        if(num2==0)
        {
            System.out.println("Maalesef 0 girdiniz. Uygulama Kapatılıyor");
            System.exit( -1); // System.exit(-1) yapınca status otomatik atandı
        }
        toplam=num1+num2;
        System.out.println("Toplam ="+toplam);
    }
}
