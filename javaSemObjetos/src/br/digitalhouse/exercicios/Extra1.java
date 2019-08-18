package br.digitalhouse.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Extra1 {
    public static void main(String[] args) {
        //analisar três números inteiros e retornar o maior deles

        int x = 2;
        int y = 45;
        int z = 456;

        if (x > y && x > z) {
            System.out.println(x + " é o maior número");
        } else if (y > x && y > z) {
            System.out.println(y + " é o maior número");
        } else if (z > x && z > y) {
            System.out.println(z + " é o maior número");
        }
    }
}

