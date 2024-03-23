public class BlackBook extends Book{
    public BlackBook(Ink ink)
    {
        super(ink);
    }

    @Override
    void write(String color) {
        ink.applyInk("black");
    }
}
