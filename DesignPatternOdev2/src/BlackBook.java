public class BlackBook extends Book{
    public BlackBook(Ink ink) {
        super(ink);
    }

//    String color;
//    public BlackBook(Ink ink,String color)
//    {
//        super(ink);
//        this.color=color;
//    }

    @Override
    void write(String color) {
        ink.applyInk("black");
    }

    @Override
    void produce() {
        System.out.println("Siyah Kitap Hazırlanıyor");
    }

//    @Override
//    void produce() {
//        System.out.println("Producing "+color+" book");
//    }
}
