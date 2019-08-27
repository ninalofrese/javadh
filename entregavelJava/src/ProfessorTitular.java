public class ProfessorTitular extends Professor{
    private String especialidade;

    public ProfessorTitular(String nome, String sobrenome, Integer tempoCasa, Integer codigoProfessor, String especialidade) {
        super(nome, sobrenome, tempoCasa, codigoProfessor);
        this.especialidade = especialidade;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "ProfessorTitular{" +
                "Dados Cadastrais=" + super.toString() +
                "especialidade='" + especialidade + '\'' +
                '}';
    }
}
