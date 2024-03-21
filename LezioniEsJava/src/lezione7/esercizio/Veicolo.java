package lezione7.esercizio;

public abstract class Veicolo {
    private String casaProduttrice;
    private String modello;
    private String colore;

    public Veicolo(String casaProduttrice, String modello, String colore) {
        this.casaProduttrice = casaProduttrice;
        this.modello = modello;
        this.colore = colore;
    }
}
