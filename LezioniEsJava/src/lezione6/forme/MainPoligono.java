package lezione6.forme;

import java.util.ArrayList;
import java.util.List;

public class MainPoligono {
    public static void main(String[] args) {
        List<Poligono> forme = new ArrayList<>();
        Triangolo triangolo = new Triangolo();
        triangolo.lato1 = 10;
        triangolo.lato2 = 8;
        triangolo.lato3 = 6;

        Quadrato quadrato = new Quadrato();
        quadrato.lato = 8;

        Rettangolo rettangolo = new Rettangolo();
        rettangolo.base = 20;
        rettangolo.altezza = 10;

        forme.add(triangolo);
        forme.add(quadrato);
        forme.add(rettangolo);

        double sommaAree = 0;

        }//end main

    } // end class MainPoligono
