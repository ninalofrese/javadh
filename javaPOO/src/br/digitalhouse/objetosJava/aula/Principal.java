package br.digitalhouse.objetosJava.aula;

import br.digitalhouse.objetosJava.aula.Animal;
import br.digitalhouse.objetosJava.aula.Pessoa;

public class Principal {
    public static void main(String[] args) {
        //Instancia o objeto - o Java fez um construtor automaticamente.
        Animal animalMamifero = new Animal("Bidu");
        Animal animalSelvagem = new Animal("Diego");

//        Printa os atributos da classe public
//        System.out.println(animalMamifero.nomeAnimal);
//        System.out.println(animalMamifero.raca);
//        System.out.println(animalMamifero.cor);
//        System.out.println(animalMamifero.idade);

        // quando o atributo é private ou protected, traz ele pelo get
        System.out.println(animalMamifero.getNomeAnimal());

        //Ctrl+ P dentro do parênteses do construtor - mostra quais construtores foram criados
        Animal animalDomestico = new Animal();

        animalDomestico.setNomeAnimal("Ted");

        //no sout, use o get buscando o atributo atualizado.
        System.out.println(animalDomestico.getNomeAnimal());
        System.out.println("*****************************");

        Pessoa pessoaJovem = new Pessoa("Erika");

        System.out.println(pessoaJovem.getNomePessoa());

        //relação entre animal e pessoa
        animalDomestico.setDonoAnimal(pessoaJovem);

        System.out.println(animalDomestico.getDonoAnimal().getNomePessoa());

        Pessoa pessoaIdosa = new Pessoa("Clotilde");

        animalDomestico.setDonoAnimal(pessoaIdosa);
    }
}
