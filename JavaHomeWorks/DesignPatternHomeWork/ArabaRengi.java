package DesignPatternHomeWork;

// Araba Rengi soyut sınıfı
abstract class ArabaRengi {
    abstract void boyama();
}

// Araba Rengi uygulamaları
class Kirmizi extends ArabaRengi {
    void boyama() {
        System.out.println("Kırmızı renge boyandı.");
    }
}

class Mavi extends ArabaRengi {
    void boyama() {
        System.out.println("Mavi renge boyandı.");
    }
}