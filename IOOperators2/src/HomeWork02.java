import java.io.*;
import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        //Ödev2: Kullanıcıdan 20 adet tam sayı alınsın. Alınan bu tam sayılarıda dosyaya yazalım. Daha sonra okuyup toplamını ve ortalamasını ekrana basalım.

        String fileName="homework02.txt";
        int sayi=0,toplam=0,ortalama=0,okunanDeger=0,n=20,sayac=0;
        try(FileWriter fileWriter2 = new FileWriter(fileName); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter2))
        {
            Scanner scanner = new Scanner(System.in);
            for (int i=1;i<=n;i++)
            {
                System.out.println(i+".Sayı giriniz: ");
                sayi=scanner.nextInt();
                bufferedWriter.write(sayi+"\n");
                //bufferedWriter.newLine();   \n yerine kullanılabilir
                //toplam=toplam+sayi;
            }
           // ortalama=toplam/20;
           // bufferedWriter.write("toplam: "+toplam);
           // bufferedWriter.write("ortalama: "+ortalama); Okuduktan sonra yazdır diyor anladın mı sen okurken işlem yapıytorsun olmaz amaç okunduktan sonra işlem yaptırtmak
        }
        catch(IOException ioException)
        {
            System.out.println("hata"+ioException.getMessage());
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName)))
        {
            String data = null;
            while((data=bufferedReader.readLine())!=null) //String değer -1 olamaz o yüzden null ile kontrol ediyoruz ve okuyoruz.
            {
              //  int okunanDeger=Integer.parseInt(data);
              //  toplam=toplam+okunanDeger;
               // Integer.parseInt(data);//String ifadeyi int ifadeye çevirdim. Anladığım kadarıyla yazdırınca artık string oluyor ifadeler. Evet  bufferedWriter.write(sayi); yazsaydım ifadeler string oalrak geliyor \n olunca int olarka alabiliyor buna gerek kalmıyor
                sayac++; //sayac=sayac+1
                toplam=toplam+Integer.parseInt(data);
                ortalama=toplam/sayac;
            }
            System.out.println("Toplam: "+toplam);
            System.out.println("Ortalama: "+ortalama);

        }
        catch(IOException fileNotFoundException)
        {
            System.out.println("hata:" + fileNotFoundException);
        }
    }
}
