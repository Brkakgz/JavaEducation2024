import java.util.Objects;

public class NullPointerExceptionExample01 {
    public static void main(String[] args) {

        String name = null;
        String name1="";

      /*  if(name!=null)
        {
            System.out.println("İsminizin uzunluğu: "+name.length());
        }
       */
       // System.out.println("İsminizin uzunluğu: "+name.length()); //NullpointerException hatası alırsın çünkü olmayan şey üzerinde değer işlemi yapmaya çalışıyoruz
        System.out.println("İsminizin Uzunluğu2: "+name1.length());

        if(Objects.nonNull(name)){ // açıkhali ---> name!=null if deki yani
            System.out.println("İsminizin uzunluğu: "+name.length());
        }
    }
}