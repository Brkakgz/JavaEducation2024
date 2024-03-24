public class ColoredBook extends Book{
    String color;
    public ColoredBook(Ink ink, String color) {
        super(ink); //Burası da black ile aynı şekilde mürekkebi superclassa gönderiyor
        this.color = color; //super callassdan gelen rengi kaydediyor
    }
    @Override
    void write(String color) {
        ink.applyInk(color); //gelen renkgi applyink'i çağırarak uygular
    }

    @Override
    void produce() {
        //System.out.println("Kitap üretildi"); //Seçilen renkle yazılan kitap hazırlanıyor
        System.out.println(color+"Kitap üretildi");
    }
}
