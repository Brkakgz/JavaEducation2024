import java.util.Scanner;

public class Deneme2 {
    public static void main(String[] args) {

        //0'dan farklı 2 sayının toplamını yazınız.

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz: ");
        int num1=scanner.nextInt();

        if(num1==0)
        {
            System.out.println("Lütfen 0'dan farklı sayı giriniz");
            System.exit(-1);//'de olur
        }

        System.out.println("2.sayıyı giriniz: ");
        int num2= scanner.nextInt();
        if(num2==0)
        {
            System.out.println("Lütfen 0'dan farklı sayı giriniz");
            System.exit(-1);
        }
        System.out.println("Toplam "+(num1+num2));
*/
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("1.sayıyı giriniz: ");
            int num1 = scanner.nextInt();
            System.out.println("2.sayıyı giriniz: ");
            int num2 = scanner.nextInt();

            if (num1 == 0 || num2 == 0) {
                System.out.println("Girilen sayılardan birisi 0'a eşittir. Yeniden giriniz");
            } else {
                System.out.println("Toplam: "+(num1+num2));
                break;
            }
        }
        }
    }

