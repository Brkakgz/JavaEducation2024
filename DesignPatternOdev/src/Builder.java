public class Builder {
    public Araba araba;
    public ArabaRengi renk;

    public Builder(Araba araba, ArabaRengi renk)
    {
        this.araba = araba;
        this.renk = renk;
    }

    void uret() {
    }
}

class ArabaBuilder extends Builder {

    public ArabaBuilder(Araba araba, ArabaRengi renk) {
        super(araba, renk);
    }

    public void uret() {
        araba.uret();
        renk.boyama();
    }
}
