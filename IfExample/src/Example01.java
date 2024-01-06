import java.sql.SQLOutput;
import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        //Hız 50'den düşükse hızx2 ceza yazsın, 50-70(dahil değil) > hız/2 ceza yazsın 70-85(dahil eğil)-> hız kadar ceza
        //85+ ve yukarısı ise -> x3 ceza yazsın, bu yolda her türlü ceza yiyoruz bu yola girmeyin :D

        Scanner scanner= new Scanner(System.in);

        double hiz,ceza;
        System.out.println("Hızı giriniz:");
        hiz=scanner.nextInt();//nextInt yerine nextDouble yapılabilir ezbere iş yapma burda çalışıyor her zaman çalışmayabilir
        
        if(hiz<50){
            ceza=hiz*2;
            System.out.println("Cezanız:" + (ceza) );
        } else if (hiz>=50 && hiz<70) {
            ceza=hiz/2;
            System.out.println("Cezanız:" + (ceza) );
        }
        else if(hiz>=70 && hiz<85){
            ceza=hiz;
            System.out.println("Cezanız" + (ceza));
        }
        else {
            ceza=hiz*3;
            System.out.println("Cezanız"+ (ceza));
        }
        System.out.println("----");

    }
}
