import java.util.Random;

public class ArrayExample04 {
    public static void main(String[] args) {
        //1-50 arasında (1 ile 50 dahil) olmak üzere 20 tane random sınıfı ile değer üretip bu değerleri array içerisine atınız
        //daha sonrasında bu dğerlerin toplamını ve ortalamasını bulunuz.

        //kendi denemem
       /* Random rand = new Random();
        int[] dizi=new int[20];
        int toplam=0;
        double ortalama=0;
        for (int i=0;i<20;i++) {
            int rand1 = rand.nextInt(50);
           rand1=dizi[i];
        }
        for(int number:dizi)
        {
            toplam=toplam+dizi;
        }
        ortalama=toplam/dizi.length;
        System.out.println("Toplam: "+toplam+"  Ortalama: "+ortalama);

        */

        Random random = new Random();
        int[] numbers = new int[20];
        int toplam=0,temp;

        for(int i=0; i<numbers.length;i++) {
            numbers[i] = random.nextInt(50) + 1;
            toplam = toplam + numbers[i];
            /*
            üstteki ile aynıdır
            temp = random.nextInt(50)+1
            numbers[i]=temp;
            toplam=toplam+temp;
            */
        }
            System.out.println("Sayıların toplamı: "+toplam);
            System.out.println("Sayıların ortalaması: "+((double)toplam/numbers.length)); //int'den double çevirdik toplamı casting
        }
    }

