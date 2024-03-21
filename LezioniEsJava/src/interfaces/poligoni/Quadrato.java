package interfaces.poligoni;

import interfaces.poligoni.IMisurePoligoni;

public class Quadrato implements IMisurePoligoni
{
    private Double lato; //dichiaro proprietà

    public Quadrato()
    {}

    public Quadrato(Double lato){
        this.lato=lato;
    }

    public Double getLato(){
        return lato;
    }

    public void setLato(Double lato) {
        this.lato = lato;
    }

    @Override
    public Double calcolaPerimetro() {
        return this.lato*4;
    }

    @Override
    public Double calcolaArea() {
        return Math.pow(this.lato, 2);// lato al quadrato
    }
}//end class Quadrato
