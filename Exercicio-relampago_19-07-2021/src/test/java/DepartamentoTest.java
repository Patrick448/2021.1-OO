import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveRetornarEscolaridadeChefeDepartamento() {
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado(pais);
        Cidade cidade = new Cidade(estado);
        Empresa empresa = new Empresa();
        Departamento  departamento = new Departamento(empresa);
        Funcionario chefe = new Funcionario();

        chefe.setEscolaridade(new Escolaridade("Superior"));

        departamento.setChefe(chefe);

        assertEquals("Superior", departamento.getDescricaoEscolaridadeChefe());
    }

    @Test
    void deveRetornarChefeNaoDefinidoDepartamento() {

        Empresa empresa = new Empresa();
        Departamento  departamento = new Departamento(empresa);

        assertEquals("chefe nao definido", departamento.getDescricaoEscolaridadeChefe());
    }

}