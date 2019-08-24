import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> listaAlunos;
    private List<Professor> listaProfessor;
    private List<Curso> listaCurso;
    private List<Matricula> listaMatricula;

    public DigitalHouseManager(List<Aluno> listaAlunos, List<Professor> listaProfessor, List<Curso> listaCurso, List<Matricula> listaMatricula) {
        this.listaAlunos = listaAlunos;
        this.listaProfessor = listaProfessor;
        this.listaCurso = listaCurso;
        this.listaMatricula = listaMatricula;
    }

    public void registrarCurso(String nome, Integer codigoCurso, Integer maxAlunos) {
        Curso novoCurso = new Curso(nome, codigoCurso, maxAlunos);
        listaCurso.add(novoCurso);
    }

    public void excluirCurso(Integer codigoCurso) {

    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer horasMonitoria) {

    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {

    }

    public void excluirProfessor(Integer codigoProfessor) {

    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno) {

    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {

    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

    }

    public List<Curso> consultarCurso(Integer codigoCurso) {

        return null;
    }
}
