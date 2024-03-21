package lezione6.forme;

public class Rettangolo extends Poligono{
    double base;
    double altezza;

    @Override
    public double area(){
        return base*altezza;
    }//end area

    @Override
    public double perimetro(){
        return 2 *(base+altezza);
    }//end perimetro
}
