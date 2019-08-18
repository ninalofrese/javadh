package br.digitalhouse.objetosJava.ex2;

public class SessaoDeTreinamento {
    private int experienciaTreino;

    public SessaoDeTreinamento(int experienciaInicial){
        experienciaTreino = experienciaInicial;
    }

    public int getExperienciaTreino(){
        return experienciaTreino;
    }

    public void setExperienciaTreino(int novaExperiencia){
        experienciaTreino = novaExperiencia;
    }

    public void treinarA(JogadorDeFutebol jogador) {
        int xpPrevia = jogador.getExperiencia();

        jogador.correr();
        jogador.fazerGol();
        jogador.correr();

        System.out.println("Experiência inicial: " + xpPrevia);
        experienciaTreino = xpPrevia + 1;
        System.out.println("Experiência final: " + experienciaTreino);
    }
}
