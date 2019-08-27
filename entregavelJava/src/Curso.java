import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nome;
    private Integer codigoCurso;
    private ProfessorTitular titular;
    private ProfessorAdjunto adjunto;
    private Integer maxAlunos;
    private List<Aluno> alunosMatriculados = new ArrayList<>();

    public Curso(String nome, Integer codigoCurso, ProfessorTitular titular, ProfessorAdjunto adjunto, Integer maxAlunos, List<Aluno> alunosMatriculados) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.titular = titular;
        this.adjunto = adjunto;
        this.maxAlunos = maxAlunos;
        this.alunosMatriculados = alunosMatriculados;
    }

    public Curso(String nome, Integer codigoCurso, Integer maxAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.maxAlunos = maxAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ProfessorTitular getTitular() {
        return titular;
    }

    public void setTitular(ProfessorTitular titular) {
        this.titular = titular;
    }

    public ProfessorAdjunto getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(ProfessorAdjunto adjunto) {
        this.adjunto = adjunto;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    public Integer getMaxAlunos() {
        return maxAlunos;
    }

    public void setMaxAlunos(Integer maxAlunos) {
        this.maxAlunos = maxAlunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigoCurso, curso.codigoCurso);
    }

    //Parte H - p.9

    public boolean adicionarUmAluno(Aluno novoAluno) {
        if (maxAlunos - alunosMatriculados.size() > 0) {
            alunosMatriculados.add(novoAluno);
            return true;
        } else {
            return false;
        }
    }

    public void excluirAluno(Aluno aluno) {
        if (alunosMatriculados.equals(aluno)) {
            alunosMatriculados.remove(aluno);
        }
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codigoCurso=" + codigoCurso +
                ", titular=" + titular +
                ", adjunto=" + adjunto +
                ", maxAlunos=" + maxAlunos +
                ", alunosMatriculados=" + alunosMatriculados +
                '}';
    }
}
