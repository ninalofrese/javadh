package br.digitalHouse.tarefaInterface;

import java.util.ArrayList;
import java.util.List;

public class TestaCadastro {
    public static void main(String[] args) {

        //Cria a data antes do cliente
        //Curiosidade: o int não deve começar com O, se não for apenas 0
        Data novaData = new Data(10,4,1981);
        Cliente novoCliente = new Cliente("Marcia", novaData, 001);

        novoCliente.imprimeDados();

        Funcionario novoFuncionario = new Funcionario("Amanda", novaData, 1000.0 );
        novoFuncionario.imprimeDados();

        System.out.println("**********************************");

        Gerente novoGerente = new Gerente("Nina", novaData, 1000.0,"Comercial");
        novoGerente.imprimeDados();

        System.out.println("**********************************");

        CadastroPessoa novoCadastro = new CadastroPessoa();
        novoCadastro.cadastrarPessoa(novoCliente);
        novoCadastro.cadastrarPessoa(novoFuncionario);
        novoCadastro.cadastrarPessoa(novoGerente);
        novoCadastro.imprimeCadastro();

        List<Imposto> impostos = new ArrayList<>();
        impostos.add(novoFuncionario);
    }
}
