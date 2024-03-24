public class BlackBook extends Book{
    public BlackBook(Ink ink) {
        super(ink); //Burası ise mürekkebi super classa iletiyor
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
        System.out.println("Siyah Mürekkeple yazılacak kitap üretildi"); //Burada direkt  kitap üretiliyor.
    }

//    @Override
//    void produce() {
//        System.out.println("Producing "+color+" book");
//    }
}
