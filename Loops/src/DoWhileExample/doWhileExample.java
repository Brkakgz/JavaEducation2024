package DoWhileExample;

public class doWhileExample {
    public static void main(String[] args) {
        int start=0;
        // Do While yapılırken önce sorgusuz yap sonra sorgula. Yani önce do içini yapar sonra while ile kontrol yapar eğer kontrol doğru ile do içerisine geri döner
        do
        {
            System.out.println("Start Valut:"+start);
            start++;
        }
        while(start<=5);
        {

        }
    }
}
