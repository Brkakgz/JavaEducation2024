public class IfElse {
    public static void main(String[] args) {

        String username="burakakgöz";
        String password="!burakAkgöz";

        if(username.equals("burakakgöz")&&password.equals("!burakAkgöz"))
        {
            System.out.println("Hoşgeldin burakakgöz");
        }
        else
        {
            System.out.println("Kullanıcı Adı veya Şifreniz Yanlış !");
        }
        if(username.equals("burakakgöz")&& password.equals("!burakAkgöz"))
        {
            System.out.println("hoşgeldiniz");
        }
        else if (username.equals("burakakgöz"))
        {
            System.out.println("Üzgünüm burakakgöz birşeyler ters gitti");
        }
        else
        {
            System.out.println("Siz kimsiniz");
        }
        System.out.println("İşlem sonu");
    }
}
