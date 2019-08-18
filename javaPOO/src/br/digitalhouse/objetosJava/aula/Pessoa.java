package br.digitalhouse.objetosJava.aula;

public class Pessoa {
    private String nomePessoa;

    //2. Construtor
    public Pessoa(String novoNome){
        nomePessoa = novoNome;
    }

    //3. Get
    public String getNomePessoa(){
        return nomePessoa;
    }

    //4. Set
    public void setNomePessoa(String novoNome){
        nomePessoa = novoNome;
    }
}
