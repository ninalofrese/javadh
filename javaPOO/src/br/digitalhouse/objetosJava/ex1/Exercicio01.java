package br.digitalhouse.objetosJava.ex1;

public class Exercicio01 {
    public static void main(String[] args) {
        Cliente clienteA = new Cliente("Ed", "Vedder");
        Cliente clienteB = new Cliente("Janis", "Joplin");

        Conta contaA = new Conta(001,clienteA,0.0);
        Conta contaB = new Conta(002,clienteB, 0.0);

        contaA.depositar(40.00);
        contaB.depositar(20.00);

        contaA.sacar(15.00);
        contaB.sacar(5.00);
    }
}
