package br.digitalhouse.objetosJava.ex2;

public class JogadorDeFutebol {
    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int experiencia;

    public JogadorDeFutebol(String nome, int energia, int alegria, int gols, int experiencia){
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;
    }

    public String getNome(){
        return nome;
    }

    public int getEnergia(){
        return energia;
    }

    public int getAlegria(){
        return alegria;
    }

    public int getGols(){
        return gols;
    }

    public int getExperiencia(){
        return experiencia;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public void setEnergia(int novaEnergia){
        energia = novaEnergia;
    }

    public void setAlegria(int novaAlegria){
        alegria = novaAlegria;
    }

    public void setGols(int novoGol){
        gols = novoGol;
    }

    public void setExperiencia(int novaExperiencia){
        experiencia = novaExperiencia;
    }


    public void fazerGol() {
        energia = energia - 5;
        alegria = alegria + 10;
        gols = gols + 1;

        System.out.println("GOOOOLLL!");
    }

    public void correr() {
        energia = energia - 10;

        System.out.println("Cansei");
    }
}
