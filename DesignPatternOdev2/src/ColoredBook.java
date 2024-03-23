public class ColoredBook extends Book{
    public ColoredBook(Ink ink)
    {
        super(ink);
    }
    @Override
    void write(String color) {
        ink.applyInk(color);
    }
}
