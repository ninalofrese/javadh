package br.digitalHouse.Ex03;

public class CalculoMatematico {

    public CalculoMatematico() {
    }

    //personaliza e trata as exceções
    public int dividir(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException(dividendo + " não é divisível por " + divisor);
        } else{
            int divisao = dividendo / divisor;
            return divisao;
        }

    }
}
