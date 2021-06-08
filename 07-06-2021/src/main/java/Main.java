public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setFrequencia(80);
        aluno1.setNotaAvaliacao1(4f);
        aluno1.setNotaAvaliacao2(4f);
        System.out.println(aluno1.verificarAprovacao());
        aluno1.setNotaAvaliacaoFinal(6f);
        System.out.println(aluno1.verificarAprovacao());

    }
}
