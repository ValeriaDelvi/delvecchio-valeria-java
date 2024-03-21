package trycatch;

import java.util.Scanner;

public class Mathsqrt {

        public static void main(String[] args) {
            Scanner tastiera = new Scanner(System.in);


            try //porzione di codice da provare
            {
                System.out.print("Inserisci numero: ");
                int n = Integer.parseInt(tastiera.nextLine());
                if(n<0)
                  throw new Exception("Non si può calcolare la radice quadrata di un numero negativo");
               //if(n>5)
                 //  throw new Exception("non è un errore ma per vedere");
                System.out.println(Math.sqrt(n));

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
}

