package lezione4;

import java.util.Scanner;

/*
Esercizio 3 (for-if):
quanto è la somma dei numeri da 1 a 100 pari o divisibili per 5?

Esercizio 4 (Liste): creare una lista di 10 nomi con ArrayList. Rimuovere quelli con la prima lettera una vocale.
Esercizio 5 (filter): data una lista con 15 numeri, creare una nuova lista con solo quelli in posizione dispari.
Esercizio 6 (terminale - while): chiedere in loop all'utente un numero da 1 a 4. Far eseguire una delle seguenti azioni.
*/
public class Es3L4 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int somma =0;
        for (int i=0; i <=100; i++){
            if(i%2 == 0 || i%5 ==0 ){
                somma +=i;
            }
        }
        System.out.println("la somma è: "+ somma);
    }
}
