public class ProfessorAdjunto extends Professor{
    private Integer horasMonitoria;

    public ProfessorAdjunto(Integer horasMonitoria, String nome, String sobrenome, Integer codigoProfessor) {
        //TODO super.nome = nome;
        this.horasMonitoria = horasMonitoria;
    }

    public Integer getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(Integer horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }
}
