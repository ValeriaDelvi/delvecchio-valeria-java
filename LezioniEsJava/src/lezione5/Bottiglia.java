package lezione5;
//creiamo la classe bottiglia e oggetti bottiglie
public class Bottiglia {

    int capacita;
    int quantita; //private int quantita -fuori dalla classe bottiglia nasconde il valore è accessibile solo nella classe

    public Bottiglia(int capacita) {
        this.capacita = capacita;
        this.quantita = 0;
    }//end constructor
public void riempi(int quantita){
        this.quantita += quantita;
    if (this.quantita > this.capacita) {
        this.quantita=this.capacita;
    //this.quantita= Math.min(this.capacita, this.quantita + quantita);
    }

}
public void svuota(int quantita){
        this.quantita -= quantita;
        if(this.quantita<0) {
            this.quantita = 0;
            //this.quantita = Math.max(0,this.quantita - quantita);
        }
}
    @Override
    public String toString() {
        return "Bottiglia{" +
                "capacita=" + capacita +
                ", quantita=" + quantita +
                '}';
    }
}//end class
