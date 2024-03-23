package DesignPatternHomeWork;

abstract class ArabaKöprü {
    protected Araba araba;
    protected ArabaRengi renk;

    public ArabaKöprü(Araba araba, ArabaRengi renk) {
        this.araba = araba;
        this.renk = renk;
    }

    abstract void uret();
}

// ArabaKöprü'ün uygulamaları
class ArabaKöprüUygulama extends ArabaKöprü {
    public ArabaKöprüUygulama(Araba araba, ArabaRengi renk) {
        super(araba, renk);
    }

    public void uret() {
        araba.uret();
        renk.boyama();
    }
}
