public class ColoredBook extends Book{
    String color;
    public ColoredBook(Ink ink, String color) {
        super(ink);
        this.color = color;
    }
    @Override
    void write(String color) {
        ink.applyInk(color);
    }

    @Override
    void produce() {
        System.out.println(color + " kitap hazırlanıyor");
    }
}
