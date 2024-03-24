abstract class Book {
    public Ink ink;

    public Book(Ink ink)
    {
        this.ink=ink; //Super class gelen mürekkebi kitaba uygulamasını söylüyor
    }
    abstract void write(String color);

    abstract void produce();
}
