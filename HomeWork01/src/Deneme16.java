import java.util.Random;
import java.util.Scanner;

public class Deneme16 {
    public static void main(String[] args) {
        /*
        kullanıcıdan 1 adet sayı istensin.4 -24 arasında istensin. method ile olacak static olmayack
        * bir çift zar atılsın. Bu zarların toplamının 2 katı kullacının girdiği sayı ile aynı olursa - method

        1 veya 2. atışta tahmin doğru olursa ise 3m
        3-6 atış 1m
        7-10 atış 500k
        11 ve sonrasında ise bonus 50 verilsin
        * */
     //   Deneme16 algorithm = new Deneme16();
     //   int customerGuessNumber = algorithm.getcustomerGuessNumber();
      //  algorithm.checkResults(customerGuessNumber);
    }
    public int customerGuessNumber()
    {
        Scanner scanner = new Scanner(System.in);
        int number;
       while(true) {
           System.out.print("Lütfen 4-24 arasında sayı giriniz: ");
           number = scanner.nextInt();
           if(number<4 || number>24)
           {
               System.out.println("Yanlış aralık");
           }
           else {
               break;
           }
       }
        return number;
    }

    public int twiceDicePoints()
    {
        int point=0;
        Random random = new Random();
        int diceNumber1 = random.nextInt(5)+1;
        int diceNumber2 = random.nextInt(5)+1;
        point = (diceNumber1+diceNumber2)*2;
        return point;
    }

 //   public int checkResults()
  //  {

  //  }
}
/*
*sınıftan birisi böyle yaptı
* Methods methods = new Methods();
int toplam = methods.getUserGuessNumber();
methods.zar(toplam);
}
public int getUserGuessNumber() {
Scanner scanner = new Scanner(System.in);
int number;
do {
System.out.println("4 ile 24 arasında bir sayı giriniz: ");
number = scanner.nextInt();
} while (number < 4 && number > 24);
return number;
}
public void zar(int toplam) {
int deneme = 0;
int zar1, zar2;
Random random = new Random();
while (true) {
deneme++;
zar1 = random.nextInt(6) + 1;
zar2 = random.nextInt(6) + 1;
if ((zar1 + zar2)*2 == toplam) {
if (deneme == 1 || deneme == 2) {
System.out.println("Tebrikler 3m dolar kazandınız.");
} else if (deneme >= 3 && deneme <= 6) {
System.out.println("Tebrikler 1m dolar kazandınız.");
} else if (deneme >= 7 && deneme <= 10) {
System.out.println("Tebrikler 500 bin dolar kazandınız. ");
} else
{
System.out.println("Tebrikler 50 dolar kazandınız.");
}
break;
}
if(toplam%2!=0)
{
System.out.println("Tebrikler 50 dolar kazandınız.");
break;
}*/