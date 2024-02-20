package lezione2;
//chiedere all'utente all'utente un numero
import java.util.Scanner;

public class BEs1 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Metti qui un numero: ");
        int n1 =Integer.parseInt(tastiera.nextLine());
        System.out.println("Grandioso! Il numero "+n1+" che hai scelto è bellissimo! ");
    }
}
