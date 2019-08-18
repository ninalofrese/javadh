package Ex02ListaSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //A ArrayList não repete e considera a ordem de add.
        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(5);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(8);
        lista.add(8);

        System.out.println("Lista - ArrayList");
        for(Integer valor :lista){
            System.out.println(valor);
        }
        //O HashSet ignora itens que repetem valores e não leva a ordem em consideração, podendo gerar listas aleatórias
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(1);
        conjunto.add(5);
        conjunto.add(5);
        conjunto.add(6);
        conjunto.add(7);
        conjunto.add(8);
        conjunto.add(8);
        conjunto.add(8);

        System.out.println("Conjunto - HashSet");
        for(Integer valor :conjunto){
            System.out.println(valor);
        }

    }
}
