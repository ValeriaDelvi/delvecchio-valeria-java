package interfaces.dipendente;

public class Bidello extends Dipendente{

    private int oreGiornaliere;

    public int getOreGiornaliere() {
        return oreGiornaliere;
    }

    public void setOreGiornaliere(int oreGiornaliere) {
        this.oreGiornaliere = oreGiornaliere;
    }

    public Bidello(String nome, String cognome, String ruolo, Double stipendio, int oreGiornaliere) {
        super(nome, cognome, ruolo, stipendio);
        this.oreGiornaliere = oreGiornaliere;

    }

    @Override
    public String toString() {
        return  "Il dipendente "+ '\n' +
                "nome: " + getNome()+ '\n' +
                "cognome: " + getCognome()+ '\n' +
                "ruolo: " + getRuolo()+ '\n' +
                "lavora per un totale di " + oreGiornaliere + " ore al giorno."+ '\n';
    }
}
