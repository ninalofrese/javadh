package br.digitalhouse.objetosJava.aula;

public class Animal {
    //1. atributos
    private String nomeAnimal;
    private String raca;
    private int idade;
    private String cor;
    private Pessoa donoAnimal;

    //2. construtores
    public Animal(String novoNomeAnimal){
        nomeAnimal = novoNomeAnimal;
    }

    public Animal(){

    }

    //3. Gets
    public String getNomeAnimal(){
        return nomeAnimal;
    }

    public String getRaca(){
        return raca;
    }

    public String getCor(){
        return cor;
    }

    public Pessoa getDonoAnimal(){
        return donoAnimal;
    }

    //5. Sets
    public void setNomeAnimal(String novoNomeAnimal){
        nomeAnimal = novoNomeAnimal;
    }

    public void setRaca(String novaRaca){
        raca = novaRaca;
    }

    public void setIdade(int novaIdade){
        idade = novaIdade;
    }

    public void setCor(String novaCor){
        cor = novaCor;
    }

    public void setDonoAnimal(Pessoa novoDono){
        donoAnimal = novoDono;
    }

    //6. métodos
    public void brincar(){
        System.out.println("O animal está brincando");
    }

}
