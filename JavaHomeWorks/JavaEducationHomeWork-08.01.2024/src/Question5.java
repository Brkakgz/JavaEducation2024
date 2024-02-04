import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        //Kullanıcıdan alınan bir pozitif sayının çift veya tek olduğunu belirleyen bir if-else ifadesi içeren bir for döngüsü yazın.

      // Bu soru için bence for döngüsü çok saçma o yüzden ufak bir yorum yapıyorum

        //Bu çözüm sadece soru için hazırlandı
        /*Scanner scan= new Scanner(System.in);
        int number1;
        System.out.println("Sayı Giriniz");
        number1= scan.nextInt();

        for(int i=1;i<=number1;i++)
        {
            if(number1%2==0)
            {
                System.out.println("Sayınız Çifttir");
                break;
            }
            else
            {
                System.out.println("Sayınız Tektir");
                break;
            }
        } */


        //Kullanıcı önce kaç sayı istediğini yazsın sonra yazdıkları sayıları kontrol etsin

        Scanner scan = new Scanner(System.in);
        int istenen,num1,sayac1=0,sayac2=0;
        System.out.print("Kaç Sayı istiyorsunuz : ");
        istenen = scan.nextInt();
        for(int i=1; i<=istenen;i++)
        {
            System.out.print("Kontrol etmek istediğiniz sayıyı giriniz: ");
            num1= scan.nextInt();
            if(num1%2==0)
            {
                System.out.println("Sayınız Çifttir");
                sayac1++;
            }
            else
            {
                System.out.println("Sayınız Tektir");
                sayac2++;

            }
        }
        System.out.println("Toplam "+sayac2+" sayı kadar tek sayı, "+"toplam "+sayac1+" sayı kadar tek sayı bulunmuştur. Kapatılıyor ...");


    }
}
