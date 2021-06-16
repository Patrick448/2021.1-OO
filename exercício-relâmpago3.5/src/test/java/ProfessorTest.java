import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    Professor professor;

    @BeforeEach
    void setup(){
        professor = new Professor();
        professor.setNome("Maria da Silva");
    }

    @Test
    void deveRetornarBacharel() {
        professor.setTituloMaximo(0);
        assertEquals("Bacharel", professor.getTituloMaximoTexto());
    }

    @Test
    void deveRetornarMestre() {
        professor.setTituloMaximo(1);
        assertEquals("Mestre", professor.getTituloMaximoTexto());
    }
    @Test
    void deveRetornarDoutor() {
        professor.setTituloMaximo(2);
        assertEquals("Doutor", professor.getTituloMaximoTexto());
    }

    @Test
    void deveRetornarTitulo0() {
        professor.setTituloMaximo(0);
        assertEquals(0, professor.getTituloMaximo());
    }

    @Test
    void deveRetornarTitulo1() {
        professor.setTituloMaximo(1);
        assertEquals(1, professor.getTituloMaximo());
    }

    @Test
    void deveRetornarTitulo2() {
        professor.setTituloMaximo(2);
        assertEquals(2, professor.getTituloMaximo());
    }

}