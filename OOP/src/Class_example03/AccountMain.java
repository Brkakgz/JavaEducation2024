package Class_example03;

public class AccountMain {
    public static void main(String[] args) {
        Account yaren = new Account();
        yaren.budget=5000;
        yaren.id=1L;
        yaren.gender="female";
        yaren.name="yaren";
        yaren.password="12345";


        Account galip = new Account();
        galip.budget=2000;
        galip.id=2L;
        galip.gender="male";
        galip.name="galip";
        galip.password="123";

        yaren.withraw(300);
        System.out.println("Yaren kalan para:"+yaren.budget);
        yaren.withraw(250);
        System.out.println("Yaren kalan para:"+yaren.budget);
        yaren.deposit(5);
        System.out.println("Yaren kalan para:"+yaren.budget);

        galip.deposit(20000);
        System.out.println("Galip kalan para:"+galip.budget);

        galip.withraw(500000);
        System.out.println("Galip kalan para:"+galip.budget);




    }
}
