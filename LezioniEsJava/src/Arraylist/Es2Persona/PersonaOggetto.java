package Arraylist.Es2Persona;

public class PersonaOggetto {
    private String nome;
    private String cognome;
    private String CF;
    private String nascita;


    public PersonaOggetto(String nome, String cognome, String CF) {
        this.nome = nome;
        this.cognome = cognome;
        this.CF = CF;
    }

    public PersonaOggetto() {}

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

    public String getCF() {
        return CF;
    }

    public void setCF(String CF) {
        this.CF = CF;
    }

    public String getNascita() {
        return nascita;
    }

    public void setNascita(String nascita) {
        this.nascita = nascita;
    }
}