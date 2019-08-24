public class ProfessorAdjunto extends Professor{
    private Integer horasMonitoria;

    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoCasa, Integer codigoProfessor, Integer horasMonitoria) {
        super(nome, sobrenome, tempoCasa, codigoProfessor);
        this.horasMonitoria = horasMonitoria;
    }

    public Integer getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(Integer horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }
}
