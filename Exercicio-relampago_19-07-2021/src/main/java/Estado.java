public class Estado {

    private Pais pais;
    private String nome;

    public Estado(Pais pais) {
        this.pais = pais;
    }
    public Estado() {
        this.pais = pais;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomePais(){
        if(pais == null){
            throw new NullPointerException("estado sem pais");
        }
        return pais.getNome();
    }
}
