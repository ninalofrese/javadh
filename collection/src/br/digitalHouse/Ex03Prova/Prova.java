package br.digitalHouse.Ex03Prova;

import java.util.Set;

public class Prova {

    public void somaTotal(Set<Integer> conjuntoDeInteiros) {
        //percorrer o conjunto de inteiros
        Integer soma = 0;

        for (Integer valor : conjuntoDeInteiros) {
            soma += valor;
        }

        System.out.println("Soma: " + soma);
        //acumular o total da soma de valores
        //imprimir o valor da soma total

    }
}
