class Magazine extends Book {
    private int numberOfPages;

    public Magazine(Ink ink, int numberOfPages) {
        super(ink);
        this.numberOfPages = numberOfPages;
    }

    @Override
    void write(String color) {
        ink.applyInk(color);
        System.out.println(numberOfPages + " sayfalık dergi sayfaları "+color+" rengi ile yazıldı");
    }

    @Override
    void produce() {
        System.out.println(numberOfPages + " sayfalık dergi üretildi");
    }
}
