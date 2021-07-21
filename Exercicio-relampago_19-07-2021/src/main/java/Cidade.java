public class Cidade {

    private Estado estado;

    public Cidade(Estado estado) {
        this.estado = estado;
    }
    public Cidade() {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNomePais(){
        if(estado == null){
            throw new NullPointerException("cidade sem estado");
        }
        return estado.getNomePais();
    }

    public String getNomeEstado(){
        if(estado == null){
            throw new NullPointerException("cidade sem estado");
        }
        return estado.getNome();
    }

}
