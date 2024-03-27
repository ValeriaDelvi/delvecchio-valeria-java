package Arraylist;
/*Scrivere un programma che inserisca dei colori all’interno di un arraylist e stamparlo.
Scrivere un metodo che restituisca
true se un colore è contenuto nella lista, false altrimenti;

Scrivere un metodo che restituisca l’indice del colore trovato
e se non trova il colore lanci un’eccezione ColorNotFoundException;*/
public class ColorNotFoundException extends Exception{
    public static final String EXC_MESSAGE = "Il colore non è presente nell'arrayList.";

    public ColorNotFoundException() {
        super(EXC_MESSAGE);
    }

    public ColorNotFoundException(String message) {
        super(message);
    }
}

// end ColorNotFoundException



