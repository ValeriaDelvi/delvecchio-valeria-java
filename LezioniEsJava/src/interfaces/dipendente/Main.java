package interfaces.dipendente;

public class Main {

    public static void main(String[] args) {
        Insegnante i1= new Insegnante("vale","manty","insegnante",4000.0, "scuola della vita");
        System.out.println(i1);
        Bidello b1= new Bidello("ale", "magno", "bidello", 1000.0, 8);
        System.out.println(b1);
    }
}
