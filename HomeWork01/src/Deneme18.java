public class Deneme18 {
    public static void main(String[] args) {
        //1 le 100 arasında olan tek ve çift sayıların toplamını bulan ve ekrana yazan uyg.-> 1-100deki tek çift ve ekrana yazma metod olsun

    Deneme18 deneme18 = new Deneme18();
    deneme18.islem();

    }

    public void islem()
    {
        int tek=0,cift=0,toplam=0;
        for(int i=0;i<=100;i++)
        {
            toplam=toplam+i;
            if(i%2==0)
            {
                cift=cift+i;
            }
            else {
                tek=tek+i;
            }
        }
        System.out.println("Tek toplam: "+tek);
        System.out.println("Cift Toplam: "+cift);
        System.out.println("Tümü toplam: "+toplam);
    }
}
