package br.digitalHouse.Ex02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> lista = new ArrayList<>();

//            lista.add("Pato");
//            lista.add("Cachorro");
//            lista.add("Gato");
            //lista vazia - IndexOutOfBounds

            System.out.println(lista.get(5));
            //NullPointer
        } catch (IndexOutOfBoundsException | NullPointerException ex) {
            System.out.println("Deu ruim: " + ex.getMessage());
            ex.printStackTrace();
        }

    }
}
