package lezione6.forme;
//Classe / sottoclasse

//Crea le classi: Poligono, Rettangolo, Quadrato, Triangolo.
//
// Le classi Rettangolo, Quadrato e Triangolo devono essere sottoclassi di Poligono.
//
// Creare gli attributi base, altezza per Rettangolo, Quadrato e Triangolo,
//lato1, lato2, lato3 per Triangolo.

//Tutte le forme devono avere i metodi area e perimetro.

//Creare una List<Poligono> forme,
// inserire un triangolo, un quadrato, un rettangolo
// e calcolare la somma delle aree.
public class Triangolo extends Poligono{
    double lato1=0;
    double lato2=0;
    double lato3=0;

    public Triangolo(double l1, double l2, double l3){
        this.lato1=l1;
        this.lato2=l2;
        this.lato3=l3;
    }//end triangolo

    public Triangolo(){

    }

    @Override
    public double area() {
        double semiperimetro = (lato1+lato2+lato3)/2;
        return Math.sqrt(semiperimetro* (semiperimetro-lato1)*(semiperimetro -lato2)*(semiperimetro-lato3));

    }//end area

    @Override
    public double perimetro() {
        return lato1+lato2+lato3;
    }//end perimetro
}//end T extend Poligono
