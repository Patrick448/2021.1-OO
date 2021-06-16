public class Aluno extends Pessoa{
    private float[] notas;
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public float calcularMedia(){
        float media = (this.getNotas()[0]+this.getNotas()[1])/2;
        return media;
    }
}
