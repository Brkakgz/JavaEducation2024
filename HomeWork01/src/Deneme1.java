import java.util.Scanner;

public class Deneme1 {
    public static void main(String[] args) {
        //0'dan farklı 2 sayının toplamını bulan program
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz: ");
        double num1=scanner.nextDouble();
        System.out.println("2.sayıyı giriniz: ");
        double num2= scanner.nextDouble();
        double ortalama=0;
        ortalama = (num1+num2)/2;
        System.out.println("Ortalama :"+ortalama);

    }



}
