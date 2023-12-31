import java.util.Locale;
import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        int number1=5,number2=3;


        boolean resultAND=number1>number2 && number1<0 && number2>0;
        System.out.println("AND:"+resultAND);

        boolean resultOR=number1>number2 || number1<0 || number2>0;
        System.out.println("OR:"+resultOR);

        // int long double float -> primitive(ilkel)
        // String, Long Double Float primitive değildir
        //Baş harfi büyük olanlar class
        String name ="Burak Akgöz".toLowerCase(); //.toLowerCase ile tüm harfleri küçülttük bunu yapınca altta tek tek büyüğü küçüğe çevirmekle uğraşmayız zaten hepsini küçülltük
        //Scanner scanner = new Scanner(System.in);
        //name. yapınca bir sürü sekme çıkar
        int lenght=name.length(); // name string değerinin uzunluğunu saydı
        System.out.println("Burak Akgöz'ün uzunluğu: "+lenght); //Burada boşluğu da bir karakter saydı
        System.out.println("toLowerCase function:"+"B".toLowerCase(Locale.ROOT)); //ROOT:DiL seçeneği orda türkçe yoktu altta ekledik ayrıca B harfini küçük karaktere çevirdik
        System.out.println("toUpperCase function:"+"i".toUpperCase(new  Locale ("tr","TR"))); // Küçük i harfini büyük i olarak çevirdik
        System.out.print("İçinde a veya B var mı ? ");
        System.out.println(name.contains("a") || name.contains("B".toLowerCase(Locale.ROOT))); //içinde a veya B geçen var mı ?
        System.out.println("---------");
        String telefon="05357589535";
        String turkcell="0535";
        String vodafone="0545";
        System.out.println(telefon.startsWith(vodafone));//vodafone ile başlıyor mu ?

        if(telefon.startsWith(vodafone))
        {
            System.out.println("Hattınız Vodafone");
        }
        if(telefon.startsWith(turkcell)){
            System.out.println("Hattınız Turkcell");
        }
    }
}
