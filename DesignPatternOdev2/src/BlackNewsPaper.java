public class BlackNewsPaper extends Book{
    public BlackNewsPaper(Ink ink) {
        super(ink); //Burası ise book'u çağırır ve blackbook nesnesini oluşturur
    }

//    String color;
//    public BlackBook(Ink ink,String color)
//    {
//        super(ink);
//        this.color=color;
//    }

    @Override
    void write(String color) {
        ink.applyInk("black"); //Uygulanan rengi belirtiyoruz
    }

    @Override
    void produce() {
        System.out.println("Siyah Mürekkeple yazılacak gazete üretildi"); //Burada direkt  kitap üretiliyor.
    }

//    @Override
//    void produce() {
//        System.out.println(+color+" mürekkeple yazılacak gazete üretildi);
//    }
}