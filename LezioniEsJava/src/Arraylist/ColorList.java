package Arraylist;
/*Scrivere un programma che inserisca dei colori all’interno di un arraylist e stamparlo.
Scrivere un metodo che restituisca
true se un colore è contenuto nella lista, false altrimenti;
Scrivere un metodo che restituisca l’indice del colore trovato
e se non trova il colore lanci un’eccezione ColorNotFoundException;*/
import java.util.ArrayList;
import java.util.List;

public class ColorList {
    public static void main(String[] args) {
        //il nostro main corrisponde al controller del metodo MVC Model View Controller
        List<String> colorList = new ArrayList<>(List.of("lilla", "viola", "bluette","celeste"));

        colorList.add("rosa");
        colorList.add("menta");

        for (String color : colorList) {
            System.out.println("Colore: " + color);


        }//end for

        System.out.println("Il colore rosa è presente nell'arrayList? "+colorList.contains("rosa"));
        System.out.println("Il colore rosso è presente nell'arrayList? "+ colorList.contains("rosso"));

        System.out.println( colorList.indexOf("rosa"));
        System.out.println( colorList.indexOf("rosso"));
        System.out.println(IndiceColore(colorList,"rosa"));
        System.out.println(IndiceColore(colorList,"giallo"));
        System.out.println(PresenzaColore(colorList,"rosa"));
        System.out.println(PresenzaColore(colorList,"blu"));
       System.out.println(IndiceColore(colorList, "lilla"));
        System.out.println(IndiceColore(colorList, "blu"));


    }//end main

    public static boolean PresenzaColore(List<String> colorList,String color){
        try //porzione di codice da provare
        {
            boolean presenzaColoreBoolean = colorList.contains(color);
            if(presenzaColoreBoolean==false) //!presenzaColoreBoolean
                //throw new Exception("il colore non è presente nell'ArrayList");
                throw new ColorNotFoundException();
            return presenzaColoreBoolean;
        } catch (ColorNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
  public static int IndiceColore(List<String> colorList,String color){
        int indice = colorList.indexOf(color);
        try {
            if(indice==-1)
                throw new Exception("l'indice che ritorna è -1, ovvero false, il colore inserito non è presente nell'ArrayList");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

      System.out.println("l'indice è: " +indice);
      return indice;
    }
}
