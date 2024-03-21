package lezione6;
//Fibonacci: Implementa un metodo statico ricorsivo
// che restituisce l'n-esimo numero della sequenza di Fibonacci.
// Nella sequenza di Fibonacci, ogni numero è la somma dei due precedenti,
// con i primi due numeri che sono 0 e 1.
// Il metodo dovrebbe prendere un indice n
// come parametro e
// restituire il numero di Fibonacci corrispondente.
public class Fibonacci {

    public static int fibonacci (int n){
        //fib(0) =0, fib(1)) = 1, fib(x)= fib(x-1) + fib(x-2)
        if(n==0 || n==1){
            return n;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }

    public static void main(String[] args) {
        int indice =10; // decido io
        int risultato = fibonacci(indice);

        System.out.println(risultato);
    }

}
