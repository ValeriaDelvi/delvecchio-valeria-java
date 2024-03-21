package lezione6;
//Rovescia una stringa:
// Crea un metodo statico ricorsivo
// che inverte una stringa.
// Il metodo dovrebbe prendere come parametro la stringa da invertire
// e restituire la stringa invertita.
// Per esempio, se il metodo riceve "java", dovrebbe restituire "avaj".
public class RovesciaStringa {
    public static String reverse(String x){
        if(x.length()<2){
            return x;
        }

            else{
                String primalettera = x.substring(0,1);
                return reverse(x.substring(1))+ primalettera;
            }
        }

public static void main(String[] args) {
    String strDaInvertire = "java";
    String risultato=  reverse(strDaInvertire);
    System.out.println(risultato);

}

}
