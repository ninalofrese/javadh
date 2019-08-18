package br.digitalhouse.objetosJava.ex5;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double quilometragem;

    public Carro(String novaMarca, String novoModelo, int novoAno, String novaCor, double novaQuilometragem){
        marca = novaMarca;
        modelo = novoModelo;
        ano = novoAno;
        cor = novaCor;
        quilometragem = novaQuilometragem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
}
