public class Main {
    public static void main(String[] args) {

        //siyah ve renkli mürekkeplerin nesnesini ürettik
        Ink blackInk = new BlackInk();
        Ink coloredInk = new ColoredInk();

        //Kitapların nesnesini ürettik bu satırdan sonra blackbook nesnesine black ink değerini gönderiyor
        Book blackBook = new BlackBook(blackInk);
        //Book blackBook = new BlackBook(blackInk,"black");
        Book redBook = new ColoredBook(coloredInk, "red");

        //Siyah kitabın üretilmesini söyledik
        blackBook.produce(); //Burada kitap ürerimi başlıyor
        //Üretilen kitabın siyah mürekkeple yapılmasını söyledik
        blackBook.write("SİYAH ");

        //Üretilen kitabın renkli mürekkeple üretilmesini söyledik
        redBook.produce();
        redBook.write("KIRMIZI"); //Hangi renkle yazılmasını istediğimizi seçiyoruz
    }
}