import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample01 {

    public static void main(String[] args) throws IOException {

        //Bu yazdığımız eski versiyonu ama bunu da bil mülakatta bu kısmıda sorabilir yaşlı adamsa :D

        //FileWriter fileWriter = new FileWriter();
        FileWriter fileWriter=null; //file.Writer.close yazabilmek için böyle yaptık.
        // burada dışarıda tanımlamak mantıklı yoksa sadece try içindeki süslüde kalır close'da kalır
        //Dosya tanımlamasını dışarıda yaparsak bu sefer dosya oluştururken hata alırsak göremeyiz. bu yüzden try içinde oluşturduk kontrol için yani

        String fileName="first_file.txt";

        try{
            fileWriter = new FileWriter("first_file.txt",true); //true yapınca altalta yapar, diğer türlü yeniden çalışınca siler baştan yazar
            fileWriter.write("MErhaba file");
            fileWriter.write("abc   ");
            fileWriter.write(System.lineSeparator());
            fileWriter.write("nextLinee");
            fileWriter.write("\n");
            fileWriter.write("nihahaha");

        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
        finally{
            fileWriter.close();
        }


        FileReader fileReader = null;
        int i;
        try {
            fileReader = new FileReader(fileName);
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
        }
        catch(FileNotFoundException fileNotFoundException)
            {
                throw new RuntimeException(fileNotFoundException);
            }
            finally
            {
                fileReader.close();
            }




        //try catch içine yazacağımız için değiştirdik yukarıda //FileReader fileReader = new FileReader(fileName); //Parantez içine neyi okuaycağımızı yazıoruz. Yukarıda dosya adımızı fileName olarak tanımladık ki isim değişikliğinde tek değişkeni değiştirmek daha kolay
       // int i ;
       // while((i=fileReader.read()) != -1) {
        //-1 okunacak başka değer var mı diye bakıyoruz yoksa bitiriyor kafası artık yapacak bişey yok.
       //     System.out.println(i);

        }
       // FileReader();

    }
