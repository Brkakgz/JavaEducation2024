import java.util.Random;
import java.util.Scanner;

public class Deneme15 {
    public static void main(String[] args) {
        //kullanıcıdan tahmini bir sayı isteyiniz.1-100 ile arasında 1 100 dahil. Bunu bethodda yazınız.
        //Yani methodumuz kullanıcıdan sayı alsın ve geri dönsün
        //Başka bir methodda 1 - 100 arasında tek tek random sayı üretsin. eğer ilk denemede kullanıcının verdiği değer üretilirse kullanıcı
        //100m dolar kazanır. eğer 1-30 arasındaysa 5m dolar kazansın
        //50. denemeden sonra ise kazanamadınız yazsın (void method olsun)


        Deneme15 algorithm = new Deneme15();
        int userGuessNumber = algorithm.getUserGuessNumber();
        algorithm.matchNumberWithUserGuessNumber(userGuessNumber);
    }
    public int getUserGuessNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("1 ve 100 arasında bir sayı giriniz: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 100);
        return number;
    }
    public void matchNumberWithUserGuessNumber(int userGuessNumber) {
        Random random = new Random();
        int randomNumberForUser;
        int sayac = 0;
        while(true) {
            randomNumberForUser = random.nextInt(100) + 1;
            sayac++;
            if(randomNumberForUser == userGuessNumber) {
                if(sayac == 1) {
                    System.out.println("Tebrikler 100M dolar kazandınız..");
                }else if(sayac >1 && sayac <= 30) {
                    System.out.println("Tebrikler 5M dolar kazandınız..");
                }else if(sayac > 30 && sayac <= 50) {
                    System.out.println("Tebrikler 1M dolar kazandınız..");
                }else {
                    System.out.println("Üzgünüm hiç bişey kazanamadınız.");
                }
                break;
            }
        }

    }
}
