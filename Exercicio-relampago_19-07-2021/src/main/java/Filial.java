public class Filial {
    private Cidade cidade;
    private Empresa empresa;

    public Filial(Cidade cidade, Empresa empresa) {
        this.cidade = cidade;
        this.empresa = empresa;
    }

    public Filial() {

    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNomePais(){
        if(cidade == null){
            throw new NullPointerException("filial sem cidade");
        }
        return cidade.getNomePais();
    }

    public String getNomeEstado(){
        if(cidade == null){
            throw new NullPointerException("filial sem cidade");
        }
        return cidade.getNomeEstado();
    }

    public String getNomeDiretorEmpresa(){
        if(empresa == null){
            throw new NullPointerException("filial sem empresa");
        }
        return empresa.getNomeDiretor();
    }
}
