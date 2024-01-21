import java.io.*;

public class BufferedWriterReaderExample01 {
    public static void main(String[] args) throws IOException {

        String fileName="buffered_writer.txt";
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("heloo");
        bufferedWriter.write("world!");
        bufferedWriter.newLine();
        bufferedWriter.write("java");
        bufferedWriter.close();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String data = null;
        while((data=bufferedReader.readLine())!=null) //String değer -1 olamaz o yüzden null ile kontrol ediyoruz ve yazdırıyoruz
        {
            System.out.println(data);
        }
        bufferedReader.close();
    }
}
