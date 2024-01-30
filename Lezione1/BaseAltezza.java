import java.util.Scanner; 
public class BaseAltezza {
    public static void main (String[] args){
       Scanner tastiera = new Scanner (System.in);
        System.out.print("Inserisci base: ");
        int base = Integer.parseInt(tastiera.nextLine());
        System.out.print("Inserisci altezza: ");
        int altezza = Integer.parseInt(tastiera.nextLine());

System.out.println("L'area è:  "+ base*altezza);

//double n1=(double)a;  convertire (cast) da char a double
char c ='a';
int n2=(int)c;
System.out.println(n2);
} // ++a a++ incremento da rivedere cercare java doc su google
}