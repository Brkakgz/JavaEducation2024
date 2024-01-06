//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int number = 5;
        switch(number)
        {
            case 5:
                System.out.println("Sizin sayı :" + 5);
                //break; // break yazmazsan hepsinin içine girer
            case 15:
                System.out.println("Sizin sayı:" + 15);
                break;
            case 20:
                System.out.println("Sizin sayı:" + 20);
                break;
            default: // default isteğe bağlıdır
                System.out.println("Değer bizde yok");
        }
    }
}