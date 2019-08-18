package br.digitalhouse.objetosJava.ex5;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String contato;


    public Cliente(String novoNome, String novoSobrenome, String novoContato){
        nome = novoNome;
        sobrenome = novoSobrenome;
        contato = novoContato;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
