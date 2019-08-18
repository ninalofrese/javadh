package br.digitalHouse.exemplo01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<String> lista = new ArrayList<>();
            lista.add("Pato");
            lista.add("Cachorro");
            lista.add("Gato");

            System.out.println(lista.get(3));
        } catch (Exception ex) {
            System.out.println("Ocorreu uma exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
