package br.digitalHouse.Ex03Prova;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> conjuntoDeInteiros = new HashSet<>();

        conjuntoDeInteiros.add(5);
        conjuntoDeInteiros.add(7);
        conjuntoDeInteiros.add(45);
        conjuntoDeInteiros.add(3);

        for (Integer valor : conjuntoDeInteiros) {
            System.out.println(valor);
        }

        Prova prova = new Prova();

        prova.somaTotal(conjuntoDeInteiros);
    }
}
