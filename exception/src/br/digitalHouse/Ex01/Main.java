package br.digitalHouse.Ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> animais = new ArrayList<>();

            animais.add("Pato");
            animais.add("Cachorro");
            animais.add("Gato");

            System.out.println(animais.get(3));
            //dá IndexOutOfBounds
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
