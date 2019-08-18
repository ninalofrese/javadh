package br.digitalhouse.objetosJava.ex1;

public class Conta {
    private int numeroConta;
    private double saldo;
    private Cliente titular;

    public Conta(int contaInicial, Cliente titularInicial, double saldoInicial){
        numeroConta = contaInicial;
        titular = titularInicial;
        saldo = saldoInicial;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public Cliente getTitular(){
        return titular;
    }

    public void setNumeroConta(int novoNumeroConta){
        numeroConta = novoNumeroConta;
    }

    public void setSaldo(double novoSaldo){
        saldo = novoSaldo;
    }

    public void setTitular(Cliente novoTitular){
        titular = novoTitular;
    }

    public void depositar(double quantia){
        //não é recomendável usar get e set aqui dentro, já que eu posso usar o atributo diretamente
        saldo = saldo + quantia;

        System.out.println("O novo saldo é " + saldo);
    }

    public void sacar(double quantia){

        if(quantia <= saldo){
            saldo = saldo - quantia;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
        } else{
            System.out.println("Saldo insuficiente");
        }

    }
}
