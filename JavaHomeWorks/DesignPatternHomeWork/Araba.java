package DesignPatternHomeWork;

public interface Araba {
    void uret();
}

// Araba türü
class Sedan implements Araba {
    public void uret() {
        System.out.println("Sedan üretildi.");
    }
}

class SUV implements Araba {
    public void uret() {
        System.out.println("SUV üretildi.");
    }
}

class SporAraba implements Araba {
    public void uret() {
        System.out.println("Spor araba üretildi.");
    }
}
