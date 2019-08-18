package br.digitalhouse.objetosJava.ex5;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria{

    //não pensei em criar um array
    List<Venda> vendas = new ArrayList<>();

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> novaVenda) {
        vendas = novaVenda;
    }

    public void registrarVenda(Carro veiculo, Cliente cliente, double valor){
        //eu instanciei, mas não lembrei de usar um default
        Venda venda = new Venda();

        venda.setComprador(cliente);
        venda.setValorDaVenda(valor);
        venda.setVeiculoVendido(veiculo);

        //adiciona itens no array
        this.vendas.add(venda);
    }
}
