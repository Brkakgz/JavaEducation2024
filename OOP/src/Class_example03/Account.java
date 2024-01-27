package Class_example03;

public class Account {

    long id;

    double budget;
    String name;

    String password;
    String gender;

    public void withraw(int cash) {
        if (budget >= cash) {
            budget = budget - cash;
            System.out.println("Şlk Önce Kartınızı sonra paranızı alınız!!!");
        } else {
            throw new RuntimeException("hesapta istenilen nakit bulunmuyor..."); //Hata yakalarsak ;)
        }
    }

    public void deposit(int cash)
    {
        budget = budget+cash;

    }
}
