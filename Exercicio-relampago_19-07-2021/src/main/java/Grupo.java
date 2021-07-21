public class Grupo {
    private Funcionario presidente;
    private Pais sede;

    public Funcionario getPresidente() {
        return presidente;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }

    public String getDescricaoEscolaridadePresidente(){
        if(presidente == null){
            return "presidente nao definido";
        }
       return presidente.getDescricaoEscolaridade();
    }
}
