package esercizio1;

import java.util.Scanner;

/**
 * @Author Valeria Del Vecchio
 * classe che implementa il primo esercizio che si occupa di creare una calcolatrice classica, ovvero,
 *una calcolatrice che implementa le 4 operazioni fondamentali
 */
public class Calcolatrice_15_02_24
{
    public static void main(String[] args)
    {

/**
        int n1 = 6;
        int n2 = 3;

        int somma = n1 + n2;
        System.out.println(somma);
      */
        Scanner tastiera = new Scanner(System.in);

        int operatore = Integer.parseInt(tastiera.nextLine());


        System.out.print("Inserisci il primo numero: ");
        int n1 = Integer.parseInt(tastiera.nextLine());
        System.out.print("Inserisci il secondo numero: ");
        int n2 = Integer.parseInt(tastiera.nextLine());

        int somma = n1 + n2;
        System.out.println(somma);


        System.out.print("Inserisci il primo numero da sottrarre: ");
        int primoAddendo= Integer.parseInt(tastiera.nextLine());

        System.out.print("Inserisci il primo secondo da sottrarre: ");
        int secondoAddendo= Integer.parseInt(tastiera.nextLine());

        System.out.println("il risultato della sottrazione è " +( primoAddendo - secondoAddendo));

        System.out.print("Inserisci il dividendo: ");
        double dividendo= Integer.parseInt(tastiera.nextLine());

        System.out.print("Inserisci il primo il divisore: ");
        double divisore= Integer.parseInt(tastiera.nextLine());

        if (divisore ==0)
        {
            System.out.println("Anche no, non si divide MAI per 0");
        }
        else
        {
            System.out.println("il risultato della divisione è " +( dividendo / divisore));
        }

        double sin = Math.sin(45);
        double cos= Math.cos(15);
        double tan= Math.tan( 35);
        System.out.println( sin + cos + tan);


    }// end main
}//end class
