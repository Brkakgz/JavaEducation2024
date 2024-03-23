package DesignPatternHomeWork;

public class BridgeOrnek {
    public static void main(String[] args) {
        ArabaKöprüUygulama sedanKırmızı = new ArabaKöprüUygulama(new Sedan(), new Kirmizi());
        sedanKırmızı.uret();

        ArabaKöprüUygulama suvMavi = new ArabaKöprüUygulama(new SUV(), new Mavi());
        suvMavi.uret();
    }
}
