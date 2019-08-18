package br.digitalhouse.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args){
        //Escrever um programa, que pegue um Array de números e retorne a soma de todos os elementos dele.

        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(76);
        numeros.add(65);
        numeros.add(43);

        int soma = 0;

        for (int i=0; i < numeros.size(); i++){

            soma = soma + numeros.get(i);
        }

        System.out.println(soma);
    }
}
