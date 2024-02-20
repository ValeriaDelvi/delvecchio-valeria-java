package lezione2;

import java.util.Scanner;

//dato un anno, stampa true se bisestile
// un anno è bisestile se
//- è divisibile per 4 ma non per 100
//-oppure è divisibile per 400
// 2024:T 1900: F
public class BEs4 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Il tuo anno è bisestile? ");
        int anno = Integer.parseInt(tastiera.nextLine());
        boolean condizione = (anno%4 == 0) &&(anno%100 != 0) || (anno%400 ==0);
        System.out.println(condizione);
    }
}
//2024 1900 2023 2000