abstract class Book {
    public Ink ink;

    public Book(Ink ink)
    {
        this.ink=ink;
    }
    abstract void write(String color);
}
