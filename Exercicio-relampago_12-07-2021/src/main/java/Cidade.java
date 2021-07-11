public class Cidade {
    private Estado estado;
    private String nome;

    public Cidade(Estado estado, String nome) {
        this.estado = estado;
        this.nome = nome;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
