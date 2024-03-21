package interfaces;

public class Main {
    public static void main(String[] args) {
        Quadrato q1 = new Quadrato();//dichiaro istanza di un oggetto (o della classe) Quadrato
        q1.setLato(5.0);//assegno istanza q1 il valore del lato
        System.out.println("L'area del quadrato è: " + q1.calcolaArea());//richiamo metodo
        System.out.println("Il perimetro del quadrato con lato "+q1.getLato()+ " è: " + q1.calcolaPerimetro());//richiamo metodo
    }
}
