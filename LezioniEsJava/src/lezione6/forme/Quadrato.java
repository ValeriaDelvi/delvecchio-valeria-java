package lezione6.forme;

public class Quadrato extends Poligono{
    double lato;

    @Override
    public double area() {
        return lato*lato;
    }//end area

    @Override
    public double perimetro() {
        return lato*4;
    }// end perimetro
}
