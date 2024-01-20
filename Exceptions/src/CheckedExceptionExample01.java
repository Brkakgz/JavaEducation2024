import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CheckedExceptionExample01 {
    public static void main(String[] args) {

        Random random = new Random(); // Ctrl yap bak bunda throw yok
        // FileWriter fileWriter = new FileWriter("doc"); //Kızarıyor Ctrl yap bak puiblic sağında throw yazar o yüzden zorunlu try catch kullanacaksın diyor
        // Ya bunu handle edeceğiz yani try catch yazacağız


        try{
            FileWriter fileWriter = new FileWriter("doc");
        }
        catch(IOException e)
        {
            System.out.println("dosyalama işleminde hata ile karşılaşıldı"+e.getMessage());
        }

        // FileWriter fileWriter2=new FileWriter("a"); // declare yapmak için main fonk yanına throws IOException yazacaksın yani   public static void main(String[] args) throws IOException
        // runtimeexception için try catch kullanılması önerilmez. Zaten try catch runtime dışında kullanılması zorunlu



    }
}
