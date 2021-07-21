import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {

    @Test
    void deveRetornarEscolaridadePresidenteGrupo() {

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


        Funcionario presidente = new Funcionario();

        Grupo grupo = new Grupo();
        grupo.setPresidente(presidente);

        assertEquals("escolaridade nao definida", grupo.getDescricaoEscolaridadePresidente());
    }
}