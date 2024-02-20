package lezione4;

import java.util.ArrayList;
import java.util.List;

/*
Esercizio 4 (Liste):
creare una lista di 10 nomi con ArrayList.
Rimuovere quelli con la prima lettera una vocale.

Esercizio 5 (filter): data una lista con 15 numeri, creare una nuova lista con solo quelli in posizione dispari.
Esercizio 6 (terminale - while): chiedere in loop all'utente un numero da 1 a 4. Far eseguire una delle seguenti azioni.
*/
public class Es4L4 {
    public static void main(String[] args) {
        List<String> nomi = new ArrayList<>();
        nomi.add("Valeria");
        nomi.add("Valentina");
        nomi.add("Ewa");
        nomi.add("Arman");
        nomi.add("Dany");
        nomi.add("Erik");
        nomi.add("Davide");
        nomi.add("Ansia");
        nomi.add("Insonnia");
        nomi.add("Meraviglia");
        System.out.println(nomi);

        System.out.println(nomi.size());// size= length di javascript sublist = slice in javascript
    }
}

