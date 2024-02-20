package lezione4;

import java.util.Scanner;

/*
Esercizio 2 (if-else):
Chiedere all'utente un numero.
Stampare il doppio se è pari,
la metà se è dispari
Esercizio 3 (for-if): quanto è la somma dei numeri da 1 a 100 pari o divisibili per 5?
Esercizio 4 (Liste): creare una lista di 10 nomi con ArrayList. Rimuovere quelli con la prima lettera una vocale.
Esercizio 5 (filter): data una lista con 15 numeri, creare una nuova lista con solo quelli in posizione dispari.
Esercizio 6 (terminale - while): chiedere in loop all'utente un numero da 1 a 4. Far eseguire una delle seguenti azioni.

        1 = inserimento numero lista
2 = rimozione numero lista
3 = stampa lista
4 = chiusura del programma.*/
public class Es2L4 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        double n = Integer.parseInt(tastiera.nextLine());
        if (n % 2 == 0) {
            System.out.println(n + " è un numero pari e "+(n*2)+" è il doppio");
        } else {
            System.out.println(n + " è un numero dispari "+(n/2)+" è metà");
        }

    }
}