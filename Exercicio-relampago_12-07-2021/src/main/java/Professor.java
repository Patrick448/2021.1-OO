public class Professor extends Pessoa{
    private Curso cursoContratado;

    public Professor(Escolaridade escolaridade, Cidade naturalidade) {
        super(escolaridade, naturalidade);
    }

    public Curso getCursoContratado() {
        return this.cursoContratado;
    }

    public void setCursoContratado(Curso cursoContratado) {
        this.cursoContratado = cursoContratado;
    }

    public String getDescricaoTipoEnsinoCursoContratado(){
        if(this.cursoContratado==null){
            throw new NullPointerException("Professor nao foi contratado para um curso");
        }
        return this.cursoContratado.getTipoEnsino().getDescricao();
    }

    public String getNomeCoordenador(){
        if(this.cursoContratado==null){
            throw new NullPointerException("Professor nao foi contratado para um curso");
        }
        return this.cursoContratado.getCoordenador().getNome();
    }

    public String getNomeDiretor(){
        if(this.cursoContratado==null){
            throw new NullPointerException("Professor nao foi contratado para um curso");
        }
        return this.cursoContratado.getEscola().getDiretor().getNome();
    }

}
