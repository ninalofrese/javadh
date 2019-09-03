package br.digitalHouse.Ex03Aluno;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Aluno alunoUm = new Aluno("Winry", 123);
        Aluno alunoDois = new Aluno("Al", 101);
        Aluno alunoTres = new Aluno("Ed", 130);
        Aluno alunoQuatro = new Aluno("Roy", 142);
        Aluno alunoCinco = new Aluno("Riza", 142);

        List<Aluno> lista = new ArrayList<>();

        lista.add(alunoUm);
        lista.add(alunoDois);
        lista.add(alunoTres);
        lista.add(alunoQuatro);

        System.out.println("O aluno " + alunoCinco.getNome() + " está na lista de alunos?\n" + lista.contains(alunoCinco));
        //Com contains dá true, depois do override (antes dá falso)



    }
}
