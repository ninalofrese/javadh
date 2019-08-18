package br.digitalhouse.objetosJava.ex5;

public class Venda {
    private double valorDaVenda;
    private Carro veiculoVendido;
    private Cliente comprador;

    public Venda(Cliente cliente, Carro veiculo, double valorVenda){
        comprador = cliente;
        veiculoVendido = veiculo;
        valorDaVenda = valorVenda;
    }

    public Venda(){

    }

    public double getValorDaVenda() {
        return valorDaVenda;
    }

    public void setValorDaVenda(double valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }

    public Carro getVeiculoVendido() {
        return veiculoVendido;
    }

    public void setVeiculoVendido(Carro veiculoVendido) {
        this.veiculoVendido = veiculoVendido;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }
}
