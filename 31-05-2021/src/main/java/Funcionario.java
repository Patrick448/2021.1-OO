import java.util.List;
import java.util.Map;

public class Funcionario {
    private String nome;
    private float salarioBruto;
    private  float totalAcrescimos;
    private float totalDescontos;
    private List<Map<String, Float>> acrescimos;

    public float calcularSalarioLiquido(){
        return salarioBruto + totalAcrescimos - totalDescontos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public float getTotalAcrescimos() {
        return this.totalAcrescimos;
    }

    public void setTotalAcrescimos(float totalAcrescimos) {
        this.totalAcrescimos = totalAcrescimos;
    }

    public float getTotalDescontos() {
        return this.totalDescontos;
    }

    public void setTotalDescontos(float totalDescontos) {
        this.totalDescontos = totalDescontos;
    }
}
