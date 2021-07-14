public class Escola {
    private Professor diretor;
    private Cidade cidade;
    private String nome;

    public Escola(Professor diretor, Cidade cidade) {
        this.diretor = diretor;
        this.cidade = cidade;
    }

    public Professor getDiretor() {
        return this.diretor;
    }

    public void setDiretor(Professor diretor) {
        this.diretor = diretor;
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricaoEscolaridadeDiretor(){
        return diretor.getDescriçãoEscolaridade();
    }
}
