package Ex03Aluno;

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
}
