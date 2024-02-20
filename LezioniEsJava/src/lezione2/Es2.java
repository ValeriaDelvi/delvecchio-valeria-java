package lezione2;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci nome");
        String nome = tastiera.nextLine();
        System.out.println("Prima lettera del nome: " + nome.substring(0,1));
        System.out.println("Prima lettera del nome: " + nome.substring(nome.length()-1));


    }
}
