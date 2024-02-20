package lezione2;

import java.util.Scanner;
//alt + invio per importare velocemente
public class Es1 {
    public static void main(String[] args) {
        Scanner tastiera= new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int n1 =Integer.parseInt(tastiera.nextLine());
        System.out.print("Inserisci un numero: ");
        int n2 =Integer.parseInt(tastiera.nextLine());

        System.out.println("La somma è: " + (n1+n2));
    }
    }

