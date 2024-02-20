package Lezione3;

public class Array {
    public static void main(String[] args) {


        for (int k = 1; k < 10; k+= 2) {
            System.out.println(k);

            int[] a = new int [10];
            a[0] = 1;
            System.out.println(a[0]);
            int[] b = {2,5,6,7,7,8};
            for( int j =0; j<b.length; j++){
                System.out.println(b[j]);
            }
        }
    }
}