package br.digitalhouse.objetosJava.ex1;

public class Cliente {
    private String nome;
    private String sobrenome;

    public Cliente(String nomeInicial, String sobrenomeInicial){
        nome = nomeInicial;
        sobrenome = sobrenomeInicial;
    }

    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public void setSobrenome(String novoSobrenome){
        sobrenome = novoSobrenome;
    }
}
