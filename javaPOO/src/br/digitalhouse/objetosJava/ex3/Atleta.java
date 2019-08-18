package br.digitalhouse.objetosJava.ex3;

public class Atleta {
    private String nome;
    private int nivel;
    private int energia;

    public Atleta(int nivel, int energia){
        this.energia = energia;
        this.nivel = nivel;
    }

    public int getNivel(){
        return nivel;
    }

    public int getEnergia(){
        return energia;
    }
}
