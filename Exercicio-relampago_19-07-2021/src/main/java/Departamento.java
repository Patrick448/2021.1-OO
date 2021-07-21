public class Departamento {
    private String nomeDepartamento;
    private Empresa empresa;
    private Funcionario chefe;

    public Departamento(Empresa empresa) {
        this.empresa = empresa;
    }
    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public Empresa getEmpresa() {
        return empresa;
    }



    public String getDescricaoEscolaridadeChefe(){
        if(chefe == null){
            return "chefe nao definido";
        }
        return chefe.getDescricaoEscolaridade();
    }

}
