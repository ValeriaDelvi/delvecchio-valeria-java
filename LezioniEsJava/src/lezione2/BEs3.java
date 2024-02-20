package lezione2;
//chiedere un numero true se è pari

import java.util.Scanner;


public class BEs3 {
    public static void main(String[] args) {
        Scanner tastiera= new Scanner(System.in);
        System.out.println("Il tuo numero è pari? ");
        int pari = Integer.parseInt(tastiera.nextLine());
        boolean condizione = pari %2 ==0;
        System.out.println(condizione);
    }
}
