package br.digitalHouse.Ex01Pessoa;

public class Main {

    public static void main(String[] args) {
        //Quando crio o objeto pessoa, estou colocando no stack que ela vai referenciar ao endereco do objeto na memória heap
        Pessoa pessoaUm = new Pessoa("Nina", 123456789);
        Pessoa pessoaDois = new Pessoa("Maria", 123456789);
        //Para o equals vir naturalmente true (sem override), ele precisa referenciar ao mesmo objeto na memória, que é o que acontece aqui.
        Pessoa pessoaTres = pessoaDois;

        //Resolução do exercicio
        //retorna false se não for sobrescrito em Pessoa - compara a referência ao endereço de memória heap
        //retorna true se for sobrescrito em Pessoa - vai comparar apenas pelo RG
        System.out.println(pessoaUm.equals(pessoaDois));
        //O que ele está comparando?
        System.out.println(pessoaUm.toString());
        System.out.println(pessoaDois.toString());
        //Como isso daria true sem override?
        System.out.println(pessoaDois.equals(pessoaTres));
    }

}
