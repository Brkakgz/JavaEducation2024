package WhileExamples;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        int sifre;
        int parola = 12345;
        int hak=3;

        while(true)
        {
            System.out.println("Şifre giriniz:");
            sifre = scanner.nextInt();
            if(sifre == parola)
            {
                System.out.println("Giris Basarili");
                break;
            }
            else {
                hak--;
                System.out.println("Giris Yanlis" +hak+"kaldi");
                if(hak==0)
                {
                    System.out.println("Bye...");
                    return;
                }
            }
        }
    }
}
