public class Professor extends Pessoa{
    private Curso cursoContratado;

    public Curso getCursoContratado() {
        return this.cursoContratado;
    }

    public void setCursoContratado(Curso cursoContratado) {
        this.cursoContratado = cursoContratado;
    }
}
