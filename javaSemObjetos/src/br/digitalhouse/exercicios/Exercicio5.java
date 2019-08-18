package br.digitalhouse.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {
    public static void main(String[] args) {
        //Receba um array e retorne a soma de todos os pares
        List<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(2);
        numeros.add(4);
        numeros.add(3);
        numeros.add(6);
        numeros.add(3);

        int soma = 0;

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                soma = soma + numeros.get(i);
            }
        }

        System.out.println("A soma dos pares é: " + soma);
    }


}
