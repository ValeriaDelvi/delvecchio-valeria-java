package lezione2;

import java.util.Scanner;

//stampare true se in voto è insufficiente (cioè tra 0 e 5)
public class BEs2 {
    public static void main(String[] args) {
       Scanner tastiera= new Scanner(System.in);
        System.out.println("Metti qui il tuo voto: ");
        int voto = Integer.parseInt(tastiera.nextLine());
        boolean condizione = (voto >=0) && (voto <5);
        System.out.println(condizione);
    }
}
