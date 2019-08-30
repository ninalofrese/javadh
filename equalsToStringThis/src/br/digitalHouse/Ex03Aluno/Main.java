package br.digitalHouse.Ex03Aluno;

import java.util.ArrayList;
import java.util.List;

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
        //Com contains dá true

        System.out.println("O aluno " + alunoCinco.getNome() + " está na lista de alunos?\n EQUALS lista e alunoCinco" + lista.equals(alunoCinco));
        //Com equals, após sobrescrever, dá false
        //a comparacao do objeto lista com o objeto alunoCinco vai dar sempre false, sao objetos diferentes

        //só que quando comparamos o objeto alunoQuatro com o alunoCinco, como o override só compara o codigo, ele dá true
        System.out.println("O aluno " + alunoCinco.getNome() + " está na lista de alunos?\n" + alunoQuatro.equals(alunoCinco));

        //para comparar os objetos que sao itens em uma lista, tem que percorrer a lista com o fori
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(alunoCinco)) {
                System.out.println("Já tem alguém com o mesmo código " + lista.get(i).getNome());
            }
        }

        //ou com o foreach
        for (Aluno valor : lista
        ) {
            if (valor.equals(alunoCinco)) {
                System.out.println("Já tem alguém com o mesmo código: " + valor.getNome());
            }
        }
        //

    }
}
