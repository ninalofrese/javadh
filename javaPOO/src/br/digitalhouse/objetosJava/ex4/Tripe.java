package br.digitalhouse.objetosJava.ex4;

// TODO: Continuar este exercício amanhã
public class Tripe {
    private boolean dobrado;
    private Integer alturaMinima;
    private Integer alturaMaxima;
    private Integer alturaAtual;

    public Tripe(boolean dobrado, Integer alturaMinima, Integer alturaMaxima, Integer alturaAtual){
        this.dobrado = dobrado;
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.alturaAtual = alturaAtual;
    }


    public boolean getDobrado() {
        return dobrado;
    }

    public Integer getAlturaAtual() {
        return alturaAtual;
    }

    public Integer getAlturaMinima() {
        return alturaMinima;
    }

    public Integer getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setDobrado(boolean dobrado) {
        this.dobrado = dobrado;
    }

    public void setAlturaAtual(Integer alturaAtual) {
        this.alturaAtual = alturaAtual;
    }

    public void setAlturaMinima(Integer alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public void setAlturaMaxima(Integer alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public void definirAltura(Integer novaAltura) {
        if(novaAltura >= alturaMinima && novaAltura <= alturaMaxima){
            alturaAtual = novaAltura;
        } else {
            System.out.println("Altura desejada não está entre o mínimo e máximo.");
        }
    }

    public void dobrar() {
        dobrado = true;
    }

    public void desdobrar() {
        dobrado = false;
    }

    public void guardar() {
        System.out.println("Ok, está guardado!");
    }

    public void prontoParaGuardar() {
        if (dobrado == true && alturaAtual == alturaMinima) {
            guardar();
            System.out.println("Guardei direto");
        } else {
            dobrar();
            definirAltura(alturaMinima);
            guardar();
            System.out.println("Dobrei e ajustei a altura para guardar melhor");
        }
    }

    public void usar() {
        System.out.println("Ok, podemos usar.");
    }

    public void prontoParaUsar() {
        if (dobrado == false && alturaAtual >= alturaMaxima / 2) {
            usar();
            System.out.println("ok, usando...");
        } else if( dobrado == true && alturaAtual <= alturaMaxima /2){
            desdobrar();
            definirAltura(alturaMaxima / 2);
            usar();
            System.out.println("ok, precisou desdobrar e ajustar a altura");
        } else if(dobrado == false && alturaAtual <= alturaMaxima /2){
            definirAltura(alturaMaxima/2);
            usar();
            System.out.println("Ok, mas ajustei a altura");
        } else if(dobrado == true && alturaAtual >= alturaMaxima/2) {
            desdobrar();
            usar();
            System.out.println("Só precisou desdobrar");
        }
    }
}
