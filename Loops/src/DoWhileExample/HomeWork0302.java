package DoWhileExample;

import java.util.Scanner;

public class HomeWork0302 {
    public static void main(String[] args) {
        int sifre,parola,hak;
        Scanner scanner = new Scanner(System.in);
        parola = 12345;
        hak=3;

        do {
            System.out.println("Şifre giriniz:");
            sifre= scanner.nextInt();
            if(sifre==parola)
            {
                System.out.println("Giriş Başarılı");
                break;
            }
            else {
                hak--;
                System.out.println("Giriş Başarısız! "+hak+" kaldı");
                if(hak==0)

                {
                    System.out.println("Hakkınız Bitti. Çıkılıyor...");
                    break;
                }
            }
        }
        while(hak>0);
    }
}