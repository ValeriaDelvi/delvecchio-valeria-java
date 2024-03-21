package lezione6;

public class Ricorsivo {
    public static int fattoriale(int y){
        if(y==0){
           return 1;
        }
        else
            System.out.println( "il fattoriale di y " + y+ " è " +y*fattoriale(y-1));
         return  y*fattoriale(y-1);

    }


    //countdown ricorsivo

    public static void countdown(int x){
        if(x>0){
            System.out.println(x);
            countdown(x-1);
        }
        else
            System.out.println("Boom"); //caso in cui non richiamiamo il metodo si chiama caso base
    }
    public static void main(String[] args) {

        fattoriale(5);

    }
}
