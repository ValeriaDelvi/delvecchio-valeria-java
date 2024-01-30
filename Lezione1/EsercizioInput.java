import java.util.Scanner;
public class EsercizioInput {
    public static void main (String[] args){
        Scanner tastiera = new Scanner (System.in);
        System.out.print("Inserisci un nome: ");
        String nome = tastiera.nextLine();
        System.out.print("Inserisci un cognome: ");
        String cognome = tastiera.nextLine();
        System.out.print("Inserisci età: ");
        String numero= "1";
        //int a =Integer.parseInt(numero) per convertire (cast) stringa- numero per l'età
        int eta =Integer.parseInt(tastiera.nextLine());
System.out.println("Ciao "+ nome + " " + cognome + " hai " + eta*2 + " anni, giusto perchè tu lo sappia.");





    }
}