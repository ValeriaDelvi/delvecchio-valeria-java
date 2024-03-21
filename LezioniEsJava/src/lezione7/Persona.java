package lezione7;

public class Persona {
    private String nome;
    private String cognome;
    private Sesso sesso;



    public Persona(String nome, String cognome, Sesso sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
    }
    public enum Sesso{
        UOMO, DONNA
    }
    public static void main(String[] args) {
        new Persona("vale","delvi", Sesso.DONNA);//enum da una lista di nomi in questo caso uomo, donna. perchè un booleano non basta
    }

}

