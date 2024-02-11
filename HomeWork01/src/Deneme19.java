import java.util.Random;
import java.util.Scanner;

public class Deneme19 {
    public static void main(String[] args) {
        /* Bir methodda kullanıcıdan kaç kez zar atılması gerektiğini sorun ve alın
        daha sonra main metodunday yazdır.

        bu adedi başka bir metoda gönderin ve o metodda rtandom ile kullanıcının istediği adet kadar zar atın ve bunları ekrana yazın. zaten ilk fonk istenilen fonk sayısı

        artık ekrana basmek yerine her çift atışın toplamını diziye atayınız. main metodunda yazdırınız
         */
    Deneme19 deneme19 = new Deneme19();
    int zarAdeti = deneme19.diceCounter();
        System.out.println(zarAdeti+"kez zar atıldı");
        int[] diziSonucu= deneme19.dice(zarAdeti);
        for(int i=0;i<zarAdeti;i++)
        {
            System.out.println("Dizi " +i+". indexi : "+ diziSonucu[i]);
        }


    }

    public int diceCounter()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç kez zar atmak istersiniz: ");
        int dice = scanner.nextInt();
        return dice;
    }

    public int[] dice(int zarAdet){
        Random random = new Random();
        int zar1,zar2;
        int[] array = new int[zarAdet];
        int[] array2 = new int[zarAdet];
        for(int i=0;i<zarAdet;i++)
        {
           zar1= random.nextInt(6)+1;
           zar2=random.nextInt(6)+1;
           System.out.println((i+1)+".zar: "+zar1+" "+zar2);

            array2[i]=zar1+zar2;
           // if(zar1==zar2)  // bunu yaparsak çift gelirse diziye atar ben öyle anlamıştım :D
            //{
            array[i]=zar1+zar2;
            //}
        }
        return array;
    }
}
