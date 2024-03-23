public class Main {
    public static void main(String[] args) {
        Ink blackInk = new BlackInk();
        Ink coloredInk = new ColoredInk();

        Book blackBook = new BlackBook(blackInk);
        Book coloredBook = new ColoredBook(coloredInk);

        blackBook.write("Siyah");
        coloredBook.write("Kırmızı");
    }
}