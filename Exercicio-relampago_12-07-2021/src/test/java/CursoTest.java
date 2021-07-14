import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarEscolaridadeCoordenadorCurso() {
        Estado estado = new Estado("Amazonas");
        Cidade cidade = new Cidade(estado, "Manaus");

        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Professor coordenador = new Professor(escolaridade, cidade);
        Professor diretor = new Professor(escolaridade, cidade);


        TipoEnsino tipoEnsino = new TipoEnsino("Medio");
        Escola escola = new Escola(diretor, cidade);

        Curso curso = new Curso(coordenador, tipoEnsino, escola);

        assertEquals("Mestrado", curso.getDescricaoEscolaridadeCoordenador());
    }




}