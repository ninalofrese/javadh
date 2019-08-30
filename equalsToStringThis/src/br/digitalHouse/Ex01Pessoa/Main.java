package br.digitalHouse.Ex01Pessoa;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa("Nina", 123);
        Pessoa pessoaDois = new Pessoa("Maria", 123); //não compara direito a partir do 4o numero

        System.out.println(pessoaUm.equals(pessoaDois));

    }

}
