package Lezione3;

import java.util.ArrayList;
import java.util.List;

public class EsempioArray {
    public static void main(String[] args) {
        List<Integer> numeri = new ArrayList<>();
        numeri.add(1);
        numeri.add(9);
        System.out.println(numeri);
        System.out.println(numeri.get(0));// mostra cosa c'è in quell'indice
        numeri.remove(1);
        System.out.println(numeri);
        System.out.println(numeri.size());// size= length di javascript sublist = slice in javascript

    }

}
