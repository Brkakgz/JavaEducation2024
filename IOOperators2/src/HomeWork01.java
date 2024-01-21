import java.io.*;
import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        /*
        Ödev: Kullanıcı boş ifade girene kadar girdiği her yazıyı dosyaya yazınız daha sonra bu yazıyı okuyup ekrana basınız
         */


        //Şuan bu ödevde txt dosyasına yazdırma var okuyup ekrana yazdırması yok
        try(FileWriter fileWriter2 = new FileWriter("homework01.txt"); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter2))
        {
            Scanner scanner = new Scanner(System.in);
            while(true)
            {
                System.out.println("Çıkış için birşey yazmadan enter basınız: ");
                String ifade= scanner.nextLine();
                if(ifade.isEmpty()) // ben if(ifade.equals("")) yapmıştım bu daha iyi oldu
                    break;
                bufferedWriter.write(ifade+"\n");
                //bufferedWriter.newLine();   \n yerine kullanılabilir

            }
        }
        catch(IOException ioException)
        {
            System.out.println("hata"+ioException.getMessage());
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("homework01.txt")))
        {
            String data = null;
            while((data=bufferedReader.readLine())!=null) //String değer -1 olamaz o yüzden null ile kontrol ediyoruz ve okuyoruz
            {
                System.out.println(data);
            }
        }
        catch(IOException fileNotFoundException)
        {
            System.out.println("hata:" + fileNotFoundException);
        }
    }
}
