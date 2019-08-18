package br.digitalhouse.exercicios;

public class Exercicio1 {
    public static void main(String[] args){
        Integer umNumeroA = 13;
        Double umNumeroB = 2.1;
        String umaCadeiadeTexto = "Olá";

        double numeroBprimitivo = 2;
        //numeroBprimitivo. -- não puxa métodos, mas aceita um int


        System.out.println(umNumeroA+ ", " + umNumeroB + ", " + umaCadeiadeTexto);

        Double soma = umNumeroA + umNumeroB;
        Double subtracao = umNumeroA - umNumeroB;

        System.out.println(soma+","+subtracao);
    }
}
