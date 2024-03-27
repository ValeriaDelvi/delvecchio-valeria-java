package trycatch;

import java.util.Scanner;
//scrivere una funzione che
//dato un numero intero
//lanci un'eccezione SE
//il numero inserito è pari
public class EccezioneNumeroPari {
    public static void main(String[] args) throws Exception {
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci numero pari: ");
        int n = Integer.parseInt(tastiera.nextLine());
        if(n %2==0)
            throw new Exception("hai inserito un numero dispari, inserisci numero pari");
        System.out.println("hai inserito un numero, bravo");
    }
}
