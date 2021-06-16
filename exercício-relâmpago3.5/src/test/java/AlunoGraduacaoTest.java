import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {

    AlunoGraduacao alunoGraduacao;

    @BeforeEach
    void setup(){
        alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao.setMatricula(1234);
        alunoGraduacao.setNome("Maria da Silva");
    }

    @Test
    void deveRetornarAprovadoFalse(){
        float[] notas = {6.9f, 7.0f};
        alunoGraduacao.setNotas(notas);
        assertEquals(false, alunoGraduacao.verificarAprovacao());
    }

    @Test
    void deveRetornarAprovadoTrue(){
        float[] notas = {7.0f, 7.0f};
        alunoGraduacao.setNotas(notas);
        assertEquals(true, alunoGraduacao.verificarAprovacao());
    }
}