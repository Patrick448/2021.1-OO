import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoTest {

    @Test
    void deveRetornarNomePais() {
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado(pais);

        assertEquals("Brasil", estado.getNomePais());
    }

    @Test
    void deveRetornarExcecaoCidadeSemEstado() {
        try{
            Estado estado = new Estado();
            estado.getNomePais();
            fail();

        }catch (NullPointerException e){
            assertEquals("estado sem pais", e.getMessage());
        }
    }
}