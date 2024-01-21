import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample02 {
    public static void main(String[] args) {
        String username = "burak";
       try( PrintWriter printWriter = new PrintWriter("text.txt"))
       {
           printWriter.println("Selam");
           printWriter.printf("Sayı %d, metin %s",45,"Adam"+"\n"); //printformat format dediğim dışarıdan alınan parametre 45--> Adam-->%s e denk gelecek
           printWriter.printf("Hoşgelniz %s \n",username);
           printWriter.printf("Sayı %f, Metin %s",45.0,username); //float için virgül değer yapmamız lazım düz 45 ayzarsak hata veriyor

       }
       catch(FileNotFoundException fileNotFoundException)
       {
           System.out.println("Dosya işleme hatası"+fileNotFoundException.getMessage());
       }

    }
}
