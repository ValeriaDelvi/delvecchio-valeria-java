package interfaces.dipendente;

public abstract class Dipendente {

    //lista proprietà
    private String nome;
    private String cognome;
    private String ruolo;
    private Double stipendio;


    //costruttore pieno e vuoto
    public Dipendente (){}

    public Dipendente(String nome, String cognome, String ruolo, Double stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.ruolo = ruolo;
        this.stipendio = stipendio;
    }

    //get e set di tutto perchè privati
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public Double getStipendio() {
        return stipendio;
    }

    public void setStipendio(Double stipendio) {
        this.stipendio = stipendio;
    }
}
