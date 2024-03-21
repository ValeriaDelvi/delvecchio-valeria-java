package esercizio3;

import java.util.Scanner;

public class CalcolatriceImplementata {
    public static void main(String[] args) {
        System.out.println("Scegli tra le operazioni:\n" +
                "\t 1)SOMMA \n \t 2)DIFFERENZA \n \t 3)PRODOTTO \n \t 4) DIVISIONE \n" );

        Scanner tastiera = new Scanner((System.in));

        System.out.println("Scegli l'operatore: ");
        int operatore = Integer.parseInt(tastiera.nextLine());

        switch (operatore) {
            case 1:
                System.out.print("Inserisci il primo addendo: ");
                double primoAddendo = Double.parseDouble(tastiera.nextLine());
                System.out.print("Inserisci il secondo addendo: ");
                double secondoAddendo = Double.parseDouble(tastiera.nextLine());
                System.out.print("Il risultato della somma è: " + (primoAddendo + secondoAddendo));

                break;

            case 2:
                System.out.print("Inserisci il primo numero: ");
                double primoNumero = Double.parseDouble(tastiera.nextLine());
                System.out.print("Inserisci il secondo numero: ");
                double secondoNumero = Double.parseDouble(tastiera.nextLine());
                System.out.print("Il risultato della sottrazione è: " + (primoNumero - secondoNumero));
                break;

            case 3:
                System.out.println("sono una moltiplicazione");
                break;

            case 4:

                System.out.print("Inserisci il dividendo: ");
                double dividendo = Integer.parseInt(tastiera.nextLine());
                System.out.print("Inserisci il primo il divisore: ");
                double divisore = Integer.parseInt(tastiera.nextLine());
                if (divisore == 0) {
                    System.out.println("Anche no, non si divide MAI per 0");
                } else {
                    System.out.println("il risultato della divisione è " + (dividendo / divisore));
                }

                /*oppure con if in linea:
                 *  double risultato= divisore ==0 ? Double.POSITIVE_INFINITY : (dividendo/divisore)
                 * se il divisore è ==0 fai questo sennò quello dai si abbiam capito, vero?*/

                break;
            default:
                System.out.println("non esist");
        }//end switch

    }//end main
}//end class
