package br.digitalHouse.Ex03Aluno;

import java.util.Objects;

public class Aluno {
    private String nome;
    private Integer numeroAluno;

    public Aluno(String nome, Integer numeroAluno) {
        this.nome = nome;
        this.numeroAluno = numeroAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(Integer numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    //Não marca nada na hora de importar o override
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(numeroAluno, aluno.numeroAluno);
    }

    //esse aceita subclasse como parametro na hora de importar o override
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Aluno)) return false;
//        Aluno aluno = (Aluno) o;
//        return Objects.equals(numeroAluno, aluno.numeroAluno);
//    }

}
