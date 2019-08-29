import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> listaAlunos = new ArrayList<>();
    private List<Professor> listaProfessor = new ArrayList<>();
    private List<Curso> listaCurso = new ArrayList<>();
    private List<Matricula> listaMatricula = new ArrayList<>();

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<Professor> getListaProfessor() {
        return listaProfessor;
    }

    public void setListaProfessor(List<Professor> listaProfessor) {
        this.listaProfessor = listaProfessor;
    }

    public List<Curso> getListaCurso() {
        return listaCurso;
    }

    public void setListaCurso(List<Curso> listaCurso) {
        this.listaCurso = listaCurso;
    }

    public List<Matricula> getListaMatricula() {
        return listaMatricula;
    }

    public void setListaMatricula(List<Matricula> listaMatricula) {
        this.listaMatricula = listaMatricula;
    }

    public void registrarCurso(String nome, Integer codigoCurso, Integer maxAlunos) {
        Curso novoCurso = new Curso(nome, codigoCurso, maxAlunos);
        listaCurso.add(novoCurso);
    }

    public void excluirCurso(Integer codigoCurso) {
        for (int i = 0; i < listaCurso.size(); i++) {
            if (listaCurso.get(i).getCodigoCurso().equals(codigoCurso)) {
                listaCurso.remove(i);
            }
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer horasMonitoria) {
        ProfessorAdjunto novoProfessorAdjunto = new ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, horasMonitoria);
        listaProfessor.add(novoProfessorAdjunto);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        ProfessorTitular novoProfessorTitular = new ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade);
        listaProfessor.add(novoProfessorTitular);
    }

    public void excluirProfessor(Integer codigoProfessor) {
        for (int i = 0; i < listaProfessor.size(); i++) {
            if (listaProfessor.get(i).getCodigoProfessor().equals(codigoProfessor)) {
                listaProfessor.remove(i);
            }
        }
    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno, Float horasDeEstudo) {
        Aluno novoAluno = new Aluno(nome, sobrenome, codigoAluno, horasDeEstudo);
        listaAlunos.add(novoAluno);
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {
        Curso curso = null;
        Aluno aluno = null;
        for (int i = 0; i < listaCurso.size(); i++) {
            if (listaCurso.get(i).getCodigoCurso().equals(codigoCurso)) {
                curso = listaCurso.get(i);
            }
        }
        for (int j = 0; j < listaAlunos.size(); j++) {
            if (listaAlunos.get(j).getCodigoAluno().equals(codigoAluno)) {
                aluno = listaAlunos.get(j);
            }
        }

        if (curso.adicionarUmAluno(aluno)) {
            Matricula novaMatricula = new Matricula(aluno, curso);
            listaMatricula.add(novaMatricula);
            System.out.println("O aluno " + aluno.getNome() + " foi matriculado em " + curso.getNome());
        } else {
            System.out.println("Não foi possível realizar a matrícula. Não há vagas em " + curso.getNome());
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {
        ProfessorTitular profTitular = null;
        ProfessorAdjunto profAdjunto = null;
        Curso curso = null;

        for (int i = 0; i < listaCurso.size(); i++) {
            if (listaCurso.get(i).getCodigoCurso().equals(codigoCurso)) {
                curso = listaCurso.get(i);
            }
        }

        for (int j = 0; j < listaProfessor.size(); j++) {
            if (listaProfessor.get(j).getCodigoProfessor().equals(codigoProfessorTitular)) {
                profTitular = (ProfessorTitular) listaProfessor.get(j);
            }
            if (listaProfessor.get(j).getCodigoProfessor().equals(codigoProfessorAdjunto)) {
                profAdjunto = (ProfessorAdjunto) listaProfessor.get(j);
            }
        }

        curso.setTitular(profTitular);
        curso.setAdjunto(profAdjunto);
    }


    public void consultarCurso(Integer codigoAluno) {

        for (int i = 0; i < listaMatricula.size(); i++) {
            if (listaMatricula.get(i).getAluno().getCodigoAluno().equals(codigoAluno)) {
                System.out.println();
                System.out.println(listaMatricula.get(i).getCurso().toString());
            }
        }


    }
}
