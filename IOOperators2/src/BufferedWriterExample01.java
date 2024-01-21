import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample01 {
    public static void main(String[] args) {

        try(FileWriter fileWriter2 = new FileWriter("buffered_writer.txt"); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter2))
        {
            bufferedWriter.write("java8 ile yazıyoruuum");
        }
        catch(IOException ioException)
        {
            System.out.println("hata"+ioException.getMessage());
        }



        //Üsttekinin daha kısaltılmış halidir
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("buffered_writer.txt")))
        {
            bufferedWriter.write("java8 ile yazıyoruuum");
        }
        catch(IOException ioException)
        {
            System.out.println("hata"+ioException.getMessage());
        }
    }
}
