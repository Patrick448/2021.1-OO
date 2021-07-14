import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarDescricaoEscolaridadeDiretor(){
        Estado estado = new Estado("Amazonas");
        Cidade cidade = new Cidade(estado, "Manaus");

        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Professor diretor = new Professor(escolaridade, cidade);

        Escola escola = new Escola(diretor, cidade);

        assertEquals("Mestrado", escola.getDescricaoEscolaridadeDiretor());
    }

}