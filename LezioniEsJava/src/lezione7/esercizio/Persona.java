package lezione7.esercizio;

public class Persona {

        private String nome;
        private String cognome;
        private lezione7.esercizio.Persona.Sesso sesso;
        private boolean patente;

    public Persona(String nome, String cognome, Sesso sesso , boolean patente) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
        this.patente = patente;
    }//end class persona
    public enum Sesso {
        UOMO, DONNA
    }//ens enum
    public static void main(String[] args) {
        new Persona("vale","delvi", Sesso.DONNA, false);
        new Persona("Tina", "Manty", Sesso.DONNA, false);
        new Persona("Dany", "Free", Sesso.UOMO, true);
        new Persona("Arman", "Bro", Sesso.UOMO, true);
    }//end main
}
