import java.io.File;
import java.io.IOException;

public class FileProcessExample03 {
    public static void main(String[] args) throws IOException {

        //Klasör oluşturma
        File directory = new File("myDir");
        boolean isCreatedDirectory = directory.mkdir();
        System.out.println("isCreatedDirectory: "+isCreatedDirectory);


        //Klasör içinde dosya oluşturma
        File file = new File(directory,"file.txt");
        boolean isCreatedFile = file.createNewFile();
        System.out.println("isCreatedFile: "+isCreatedFile);


        //Klasör içinde dosya varsa silemez false verir
        boolean isDirectoryDeleted = directory.delete();
        System.out.println("isDirectoryDelete: "+ isDirectoryDeleted);

        //Dosyayı sildi
        boolean isFileDeleted = file.delete();
        System.out.println("isFileDeleted: "+ isFileDeleted);

        //klasörü sildi
        boolean isDirectoryDeleted2 = directory.delete();
        System.out.println("isDirectoryDeleted2: "+ isDirectoryDeleted2);
        }
        //Burada yaptıklarımız klasör oluştur içine dosya oluştur klasör sil(silemez) dosya sil klasör sil
}
