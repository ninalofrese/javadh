import br.com.digitalhouse.DHException;
import br.com.digitalhouse.DigitalException;
import br.com.digitalhouse.Estudioso;
import br.com.digitalhouse.OtherException;

public class Principal {
    //Parte J - p.13
    public static void main(String[] args) {
        DigitalHouseManager escola = new DigitalHouseManager();

        escola.registrarProfessorTitular("John", "Keating", 1, "Code Poetry");
        escola.registrarProfessorTitular("Bruce", "Banner", 2, "Smash");
        escola.registrarProfessorAdjunto("Robert", "Langdon", 3, 0);
        escola.registrarProfessorAdjunto("Dewey", "Finn", 4, 0);

        escola.registrarCurso("Full Stack", 20001, 3);
        escola.registrarCurso("Android", 20002, 2);

        escola.alocarProfessores(20001, 2, 3);
        escola.alocarProfessores(20002, 1, 4);

        escola.matricularAluno("Peter", "Parker", 1, 6.5f);
        escola.matricularAluno("Carol", "Danvers", 2, 3.1f);
        escola.matricularAluno(1, 20001);
        escola.matricularAluno(2, 20001);
        escola.matricularAluno("Natasha", "Romanoff", 3, 0.7f);
        escola.matricularAluno("Wanda", "Maximoff", 4, 1.5f);
        escola.matricularAluno("Gamora", "Titan", 5, 4.2f);
        escola.matricularAluno(3, 20002);
        escola.matricularAluno(4, 20002);
        escola.matricularAluno(5, 20002);

        System.out.println(escola.getListaAlunos().toString());
        System.out.println(escola.getListaCurso().toString());
        System.out.println(escola.getListaProfessor().toString());
        System.out.println(escola.getListaMatricula().toString());

        escola.consultarCurso(3);

        //Excluir professor
//        escola.excluirCurso(20002);
//        System.out.println(escola.getListaCurso().toString());
//        escola.excluirProfessor(4);
//        System.out.println(escola.getListaProfessor().toString());

        try {
            Estudioso estudioso = new Aluno("Nina", "Lofrese", 12, 8.5f);
            DigitalException.matriculaDH(estudioso);
        } catch (Exception ex) {
            if (ex instanceof DHException) {
                System.out.println("Vir ao co-learning");
            } else if (ex instanceof OtherException) {
                System.out.println("Falar com os alunos");
            }
        }

    }

}
