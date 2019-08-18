package br.digitalhouse.objetosJava.ex3;

public class Exercicio03 {
    public static void main(String[] args) {
        Atleta esportistaA = new Atleta(60, 80);
        Atleta esportistaB = new Atleta(80, 80);

        Prova provaA = new Prova(80,40);
        Prova provaB = new Prova(40,60);
        Prova provaC = new Prova(20,75);

        System.out.println("esportistaA");
        provaA.podeRealizar(esportistaA);
        provaB.podeRealizar(esportistaA);
        provaC.podeRealizar(esportistaA);

        System.out.println("esportistaB");
        provaA.podeRealizar(esportistaB);
        provaB.podeRealizar(esportistaB);
        provaC.podeRealizar(esportistaB);

    }
}
