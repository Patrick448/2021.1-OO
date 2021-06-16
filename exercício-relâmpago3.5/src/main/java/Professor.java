public class Professor extends Pessoa{
    private static String[] titulos = {"Bacharel", "Mestre", "Doutor"};
    private int tituloMaximo;

    public int getTituloMaximo() {
        return tituloMaximo;
    }

    public void setTituloMaximo(int tituloMaximo) {
        this.tituloMaximo = tituloMaximo;
    }

    public String getTituloMaximoTexto() {
        return titulos[tituloMaximo];
    }

}
