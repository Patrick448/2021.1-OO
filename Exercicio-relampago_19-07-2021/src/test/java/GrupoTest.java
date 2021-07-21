import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {

    @Test
    void deveRetornarEscolaridadePresidenteGrupo() {
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado(pais);
        Cidade cidade = new Cidade(estado);
        Empresa empresa = new Empresa();
        Filial filial = new Filial(cidade, empresa);
        Departamento  departamento = new Departamento(empresa);
        Funcionario presidente = new Funcionario();
        presidente.setEscolaridade(new Escolaridade("Superior"));

        Grupo grupo = new Grupo();
        grupo.setPresidente(presidente);

        assertEquals("Superior", grupo.getDescricaoEscolaridadePresidente());
    }

    @Test
    void deveRetornarPresidenteNaoDefinidoGrupo() {
        Grupo grupo = new Grupo();
        assertEquals("presidente nao definido", grupo.getDescricaoEscolaridadePresidente());
    }

    @Test
    void deveRetornarEscolaridadeNaoDefinidaPresidenteGrupo() {

        Pais pais = new Pais("Brasil");
        Estado estado = new Estado(pais);
        Cidade cidade = new Cidade(estado);
        Empresa empresa = new Empresa();
        Filial filial = new Filial(cidade, empresa);
        Departamento  departamento = new Departamento(empresa);
        Funcionario presidente = new Funcionario();

        Grupo grupo = new Grupo();
        grupo.setPresidente(presidente);

        assertEquals("escolaridade nao definida", grupo.getDescricaoEscolaridadePresidente());
    }
}