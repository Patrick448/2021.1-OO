public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Ademilson Soares");
        funcionario.setSalarioBruto(1500f);
        funcionario.setTotalAcrescimos(150f);
        funcionario.setTotalDescontos(60f);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Ana Lúcia Morais");
        funcionario2.setSalarioBruto(1900f);
        funcionario2.setTotalAcrescimos(210f);
        funcionario2.setTotalDescontos(100f);

        imprimirContracheque(funcionario);
        imprimirContracheque(funcionario2);
    }
    public static void imprimirContracheque(Funcionario funcionario){
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário bruto: " + funcionario.getSalarioBruto());
        System.out.println("Acréscimos: " + funcionario.getTotalAcrescimos());
        System.out.println("Descontos: " + funcionario.getTotalDescontos());
        System.out.println("Salário líquido: " + funcionario.calcularSalarioLiquido());
        System.out.println();
    }
}
