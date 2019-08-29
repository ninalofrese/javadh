import br.com.digitalhouse.Estudioso;

import java.util.Objects;

public class Aluno implements Estudioso {
    private String nome;
    private String sobrenome;
    private Integer codigoAluno;
    private Float horasDeEstudo;

    public Aluno(String nome, String sobrenome, Integer codigoAluno, Float horasDeEstudo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoAluno = codigoAluno;
        this.horasDeEstudo = horasDeEstudo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public Float getHorasDeEstudo() {
        return horasDeEstudo;
    }

    public void setHorasDeEstudo(Float horasDeEstudo) {
        this.horasDeEstudo = horasDeEstudo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(codigoAluno, aluno.codigoAluno);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", codigoAluno=" + codigoAluno +
                '}';
    }

    @Override
    public float getNivelDeEstudo() {
        return horasDeEstudo;
    }
}
