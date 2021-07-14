public class Aluno extends Pessoa{
    private Curso curso;

    public Aluno(Escolaridade escolaridade, Cidade  naturalidade, Curso curso) {
        super(escolaridade, naturalidade);
        this.curso =curso;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNomeEstadoMatricula(){
        return this.curso.getEscola().getCidade().getEstado().getNome();
    }

    public String getNomeCoordenadorCurso(){
        return this.curso.getCoordenador().getNome();
    }

}
