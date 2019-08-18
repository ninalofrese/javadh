package br.digitalhouse.objetosJava.ex3;

public class Prova {
    private int dificuldade;
    private int energiaNecessaria;

    public Prova(int dificuldade, int energiaNecessaria){
        this.dificuldade = dificuldade;
        this.energiaNecessaria = energiaNecessaria;
    }

    public int getDificuldade(){
        return dificuldade;
    }

    public int getEnergiaNecessaria(){
        return energiaNecessaria;
    }

    public void podeRealizar(Atleta esportista){

        if(esportista.getNivel() >= dificuldade && esportista.getEnergia() >= energiaNecessaria){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
