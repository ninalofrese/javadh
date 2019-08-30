package br.digitalHouse.Ex04SaveTheRoupa;

public abstract class Peca {
    private String marca;
    private String modelo;

    public Peca(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void retirada();

    @Override
    public String toString() {
        return "Peca{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
