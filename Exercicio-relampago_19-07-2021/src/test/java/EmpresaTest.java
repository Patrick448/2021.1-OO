import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarNomeDiretorEmpresa() {

        Funcionario diretor = new Funcionario();
        diretor.setNome("Roberto");

        Empresa empresa = new Empresa();
        empresa.setDiretor(diretor);


        assertEquals("Roberto", empresa.getNomeDiretor());
    }

    @Test
    void deveRetornarDiretorNaoDefinido() {

        Empresa empresa = new Empresa();

        assertEquals("diretor nao definido", empresa.getNomeDiretor());
    }
}