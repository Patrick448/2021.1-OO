import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AlunoTest {

    Aluno aluno;

    @BeforeEach
    void setup(){
        aluno = new Aluno();
    }

    @Test
    void deveRetornarMatricula() {
        aluno.setMatricula(1234);
        assertEquals(1234, aluno.getMatricula());
    }

    @Test
    void deveRetornarNotas() {
        float[] notas = {5.4f, 3.2f};
        aluno.setNotas(notas);

        assertArrayEquals(new float[] {5.4f, 3.2f}, aluno.getNotas());
    }

    @Test
    void deveRetornarMedia() {
        float[] notas = {5.4f, 3.2f};
        aluno.setNotas(notas);

        assertEquals(4.3f, aluno.calcularMedia());
    }
}