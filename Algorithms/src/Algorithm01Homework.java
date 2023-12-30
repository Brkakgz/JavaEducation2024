import java.util.Scanner;

public class Algorithm01Homework {

    //girilen iki sayının toplamı çarpımı çıkarımı
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        int num1,num2,toplama,cikarma,carpma,bolme;
        System.out.println("Birinci sayıyı giriniz:");
        num1 = reader.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        num2 = reader.nextInt();
        toplama=num1+num2;
        cikarma=num1-num2;
        carpma=num1*num2;
        System.out.println("Toplama"+toplama);
        System.out.println("Çıkarma"+cikarma);
        System.out.println("Çarpma"+carpma);
        //bolme=num1/num2; if else ile kontrol etmemiz lazım int için num1<num2 ve num2=0ise hata verir
    }
}
