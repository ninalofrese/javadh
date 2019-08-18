package br.digitalHouse.Ex03;

public class Teste {
    public static void main(String[] args) {
        try {
            CalculoMatematico conta = new CalculoMatematico();
            conta.dividir(4, 0);
            //Erro: ArithmeticException / by zero
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
            //ex.printStackTrace();
        }

//            CalculoMatematico conta = new CalculoMatematico();
//            conta.dividir(4, 0);
            //Erro: ArithmeticException / by zero

    }
}
