public class Curso {
    private Professor coordenador;
    private TipoEnsino tipoEnsino;
    private Escola escola;

    public Curso(Professor coordenador, TipoEnsino tipoEnsino, Escola escola) {
        this.coordenador = coordenador;
        this.tipoEnsino = tipoEnsino;
        this.escola = escola;
    }

    public Professor getCoordenador() {
        return this.coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public TipoEnsino getTipoEnsino() {
        return this.tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public Escola getEscola() {
        return this.escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public String getDescricaoEscolaridadeCoordenador(){
        if(this.coordenador == null)
            throw new NullPointerException("Coordenador nao definido");

        return this.coordenador.getDescriçãoEscolaridade();
    }
}
