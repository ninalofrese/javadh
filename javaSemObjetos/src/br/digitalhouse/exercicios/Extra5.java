package br.digitalhouse.exercicios;

public class Extra5 {
    public static void main(String[] args) {
        int numA = 201;
        int numB = 300;
        int numC = 15;
        int numD = 46;

        if((numA > numC && numA > numB) || (numB > numC && numB > numD)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
