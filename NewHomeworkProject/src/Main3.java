
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        //istersek String i kullanıcıdan alabiliriz
        //Scanner scan = new Scanner(System.in);
        //String repeatedString = scan.nextLine();

        int tekrar = 1000000;
        String repeatedString = "a";
        char repeatedChar [] = repeatedString.toCharArray();
        int stringHarf = repeatedChar.length;
        char harfler[] = new char[tekrar];

        int sayac = 0;
        int aSayaci = 0;

        for (int i=0; i<tekrar; i++){

            harfler[i] = repeatedChar[sayac];

            if (repeatedChar[sayac] == 'a'){
                aSayaci++;
            }
            sayac++;

            if (sayac==stringHarf){
                sayac=0;
            }
        }
        System.out.println("harflerin tekrarı şu şekildedir: " + Arrays.toString(harfler));
        System.out.println("A harfi toplamda, " + aSayaci + " kere tekrar etmiştir");

    }
}