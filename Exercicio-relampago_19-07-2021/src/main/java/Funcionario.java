public class Funcionario {
    private Escolaridade escolaridade;
    private Filial filialCoodenacao;
    private Filial filialContratacao;
    private Departamento departamentoAlocacao;
    private String nome;

    public Funcionario(Filial filialContratacao) {
        this.filialContratacao = filialContratacao;
    }
    public Funcionario() {
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public void setFilialCoodenacao(Filial filialCoodenacao) {
        this.filialCoodenacao = filialCoodenacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFilialContratacao(Filial filialContratacao) {
        this.filialContratacao = filialContratacao;
    }

    public void setDepartamentoAlocacao(Departamento departamentoAlocacao) {
        this.departamentoAlocacao = departamentoAlocacao;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public Departamento getDepartamentoAlocacao() {
        return departamentoAlocacao;
    }

    public Filial getFilialCoodenacao() {
        return filialCoodenacao;
    }

    public String getNome() {
        return nome;
    }

    public Filial getFilialContratacao() {
        return filialContratacao;
    }

    public String getDescricaoEscolaridade(){
        if(escolaridade==null){
            return "escolaridade nao definida";
        }
        return this.escolaridade.getDescricao();
    }

    public String getNomePaisAlocacao(){
        if(filialContratacao == null){
            throw new NullPointerException("funcionario sem filial");
        }
        return filialContratacao.getNomePais();
    }

    public String getNomeEstadoFilialCoordenacao(){
        if(filialCoodenacao==null) {
            return "funcionario nao coordena filial";
        }
        return filialCoodenacao.getNomeEstado();
    }
}
