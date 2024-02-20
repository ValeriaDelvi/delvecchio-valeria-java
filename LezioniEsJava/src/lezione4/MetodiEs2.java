package lezione4;

import java.util.Scanner;

/*Esercizio 2 crea un metodo contrario che prende un nome n e restituisce il nome al contrario (guardare codice su github vecchio)

per testarlo: System.out.println(contrario("Filippo")) deve stampare oppiliF*/
public class MetodiEs2 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome: ");
        String nome = tastiera.nextLine();

        System.out.println("Il tuo nome al contrario è: ");
        for (int i = nome.length() - 1; i>=0; i--) {
            System.out.print(nome.charAt(i));
        }//end for
    }//end main
}//end class
