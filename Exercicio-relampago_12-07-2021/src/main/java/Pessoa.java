public abstract class Pessoa {
    private Cidade naturalidade;
    private String nome;
    private Escolaridade escolaridade;

    public Pessoa(Escolaridade escolaridade, Cidade naturalidade) {
        this.escolaridade = escolaridade;
        this.naturalidade = naturalidade;
    }

    public Cidade getNaturalidade() {
        return this.naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getDescriçãoEscolaridade(){
        if(this.escolaridade == null)
            throw new NullPointerException("Nao definido");

        return this.escolaridade.getDescricao();
    }

    public String getNomeEstadoNaturalidade(){
        return this.naturalidade.getEstado().getNome();
    }

    public String getNomeCidadeNaturalidade(){
        return this.naturalidade.getNome();
    }

}
