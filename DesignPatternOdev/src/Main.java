public class Main {

    public static void main(String[] args) {
        ArabaBuilder sedanKirmizi = new ArabaBuilder(new Sedan(), new Kirmizi());
        sedanKirmizi.uret();

        System.out.println();

        ArabaBuilder suvMavi = new ArabaBuilder(new SUV(), new Mavi());
        suvMavi.uret();
    }
}
