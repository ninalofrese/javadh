package br.digitalhouse.objetosJava.ex2;

public class Exercicio02 {
    public static void main(String[] args) {
        JogadorDeFutebol jogadorA = new JogadorDeFutebol("Edson", 45, 35, 5, 40);
        JogadorDeFutebol jogadorB = new JogadorDeFutebol("Rafael", 60, 50, 10, 35);

        SessaoDeTreinamento treinamento = new SessaoDeTreinamento(10);

        treinamento.treinarA(jogadorA);
        treinamento.treinarA(jogadorB);
    }
}
