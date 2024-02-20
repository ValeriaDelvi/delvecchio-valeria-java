package lezione2;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

    Scanner tastiera = new Scanner(System.in);

   System.out.println("Inserisci nome Utente: ");
    String utente = tastiera.nextLine();

          System.out.println("Inserisci pass: ");
    String pass = tastiera.nextLine();

    boolean condizione = (utente.equals("valeria")) &&(pass.equals("lilla"));
        System.out.println(condizione);
        if (condizione){
        System.out.println("Messaggio segreto");
    }else{
        System.out.println("User e/o password errati");
    }
    }

}
