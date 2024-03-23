public class Main {
    public static void main(String[] args) {
        Ink blackInk = new BlackInk();
        Ink coloredInk = new ColoredInk();

        Book blackBook = new BlackBook(blackInk);
        //Book blackBook = new BlackBook(blackInk,"black");
        Book redBook = new ColoredBook(coloredInk, "red");

        blackBook.produce();
        blackBook.write("SİYAH ");

        redBook.produce();
        redBook.write("KIRMIZI");
    }
}