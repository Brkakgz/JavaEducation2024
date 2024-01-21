import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileProccessWithJava8 {
    public static void main(String[] args) throws IOException {

        //Before Java8
        FileWriter fileWriter=null;
        String fileName = "file_writer.txt";
        try{
            fileWriter = new FileWriter(fileName,false);
            fileWriter.write("selam");
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
        finally {
            fileWriter.close();
        }

        //After Java8, otomatik close ediyor finally yoktur. Mülakatta sorulur
        try(FileWriter fileWriter1 = new FileWriter("file_writer2.txt"))
        {
        fileWriter1.write("java8 ile yazıyorum");
        }
        catch(IOException ioException)
        {
            System.out.println("hata"+ioException.getMessage());
        }

        //File writer dışında önce file writer lazım. Filewriter'e buffer özelliği yapabiliriz çünkü öyle yapıyoruz hep
        //FileWriter fileWriter2 = new FileWriter("buffered_writer.txt");'ı dışarı yazabiliriz ama altına
        //fileWeirer2.close(); yapmamız lazım ee otomatik olmasının ne anlamı var ikisini de try içine koyarsak oto ikisini de kapar.Zaten java8'e gelen özellik o otomatik kapaması 3.lazım olsa yine ; ile ayırırız
        try(FileWriter fileWriter2 = new FileWriter("buffered_writer.txt"); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter2))
        {
            bufferedWriter.write("java8 ile yazıyoruuum");
        }
        catch(IOException ioException)
        {
            System.out.println("hata"+ioException.getMessage());
        }
    }
}
