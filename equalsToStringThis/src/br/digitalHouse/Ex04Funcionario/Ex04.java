package br.digitalHouse.Ex04Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<Funcionario> quadroFuncionarios = new ArrayList<>();

        quadroFuncionarios.add(new Funcionario("John", 123));
        quadroFuncionarios.add(new Funcionario("Jane", 143));
        quadroFuncionarios.add(new Funcionario("Edwin", 13));
        quadroFuncionarios.add(new Funcionario("Paul", 456));

        Funcionario novoFuncionario = new Funcionario("Julia", 13);

        System.out.println(novoFuncionario.getNome() + " está na lista? " + quadroFuncionarios.contains(novoFuncionario));
        //false antes do override, true depois do override

    }
}
