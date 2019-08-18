package br.digitalhouse.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio6 {
    //Array de números e retornar os números pares
    public static void main(String[] args){
        List<Integer> numeros = new ArrayList<>();

        numeros.add(8);
        numeros.add(6);
        numeros.add(4);
        numeros.add(3);
        numeros.add(2);

        List<Integer> numerosPares = new ArrayList<>();

        for(int i=0;i<numeros.size();i++){
            if(numeros.get(i)%2==0) {
                numerosPares.add(numeros.get(i));
            }
        }

        System.out.println(numerosPares);
    }
}
