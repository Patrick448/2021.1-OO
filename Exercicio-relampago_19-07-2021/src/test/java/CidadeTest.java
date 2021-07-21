import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    void deveRetornarNomePais() {
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado(pais);
        Cidade cidade = new Cidade(estado);


        assertEquals("Brasil", cidade.getNomePais());
    }

    @Test
    void deveRetornarExcecaoCidadeSemEstado() {
        try{
            Cidade cidade = new Cidade();
            cidade.getNomePais();
            fail();

        }catch (NullPointerException e){
            assertEquals("cidade sem estado", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoCidadeSemEstado2() {
        try{
            Cidade cidade = new Cidade();
            cidade.getNomeEstado();
            fail();

        }catch (NullPointerException e){
            assertEquals("cidade sem estado", e.getMessage());
        }
    }

}