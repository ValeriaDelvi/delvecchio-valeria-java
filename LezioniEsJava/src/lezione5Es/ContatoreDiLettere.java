package lezione5Es;

//Contatore di lettere:
// Scrivi un metodo statico
//public static void metodoStatico() {
 //   System.out.println(“Sono il metodo statico”);}

// che accetta una stringa e un carattere, e
//metodoStatico(String Stringa, char carattere)

// conta quante volte quel carattere appare nella stringa.
// String Stringa = "Vi siete mai chiesti quante a avesse questa frase? No ovviamente, ma noi lo scopriremo lo stesso"
//conta se "a" è presente almeno una volta

// Utilizza un ciclo for per scorrere la stringa.

import java.util.Scanner;

public class ContatoreDiLettere {
    public static void metodoStatico(String stringa, char carattere) {
        int ripetizioneCarattere=0;
        for(int i=0; i < stringa.length(); i++){
            if(stringa.charAt(i)==carattere){
                ripetizioneCarattere++;
            }//end if

        }//end for

        System.out.println("Sono il metodo statico e nella stringa\n ''"+ stringa+ "''\n ci sono " + ripetizioneCarattere + " " + carattere);
    }//end Metodo statico

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String str = "Vi siete mai chiesti quante a avesse questa frase? No ovviamente, ma noi lo scopriremo lo stesso";
        ContatoreDiLettere.metodoStatico(str, 'a');
        ContatoreDiLettere.metodoStatico(str, 'v');
        ContatoreDiLettere.metodoStatico(str, 'x');


    }//end main
}//end class
