import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {

    AlunoEnsinoMedio alunoEnsinoMedio;

    @BeforeEach
    void setup(){
        alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio.setMatricula(1234);
        alunoEnsinoMedio.setNome("Maria da Silva");
    }

    @Test
    void deveRetornarAprovadoFalse(){
        float[] notas = {5.9f, 6.0f};
        alunoEnsinoMedio.setNotas(notas);
        assertEquals(false, alunoEnsinoMedio.verificarAprovacao());
    }

    @Test
    void deveRetornarAprovadoTrue(){
        float[] notas = {6.0f, 6.0f};
        alunoEnsinoMedio.setNotas(notas);
        assertEquals(true, alunoEnsinoMedio.verificarAprovacao());
    }

}