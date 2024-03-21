package interfaces.dipendente;

public class Insegnante extends Dipendente{

    private String materia;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Insegnante(String nome, String cognome, String ruolo, Double stipendio, String materia) {
        super(nome, cognome, ruolo, stipendio);
        this.materia =materia;

    }

    @Override
    public String toString() {
        return "Il dipendente "+ '\n' +
                "nome: " + getNome()+ '\n' +
                "cognome: " + getCognome()+ '\n' +
                "ruolo: " + getRuolo()+ '\n' +
                "insegna la materia: " + materia+ '\n' ;
    }
}
