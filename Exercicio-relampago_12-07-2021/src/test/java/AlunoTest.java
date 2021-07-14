import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    Estado estado;
    Cidade cidade;

    Escolaridade escolaridadeMedio;
    Escolaridade escolaridadeMestrado;

    Professor coordenador;
    Professor diretor;

    TipoEnsino tipoEnsino;
    Escola escola;
    Curso curso;

    @BeforeEach
    void setup(){
        estado = new Estado("Amazonas");
        cidade = new Cidade(estado, "Manaus");

        escolaridadeMedio = new Escolaridade("Ensino Medio");
        escolaridadeMestrado = new Escolaridade("Mestrado");

        coordenador = new Professor(escolaridadeMestrado, cidade);
        coordenador.setNome("Paulo");
        diretor = new Professor(escolaridadeMestrado, cidade);

        tipoEnsino = new TipoEnsino("Medio");
        escola = new Escola(diretor, cidade);
        curso = new Curso(coordenador, tipoEnsino, escola);

    }

    @Test
    void deveRetornarNomeEstadoNaturalidade() {

        Aluno aluno = new Aluno(escolaridadeMedio, cidade, curso);
        assertEquals("Amazonas", aluno.getNomeEstadoNaturalidade());
    }

    @Test
    void deveRetornarNomeEstadoMatricula() {
        Aluno aluno = new Aluno(escolaridadeMedio, cidade, curso);
        assertEquals("Amazonas", aluno.getNomeEstadoMatricula());
    }

    @Test
    void deveRetornarNomeCoordenadorCurso() {

        Aluno aluno = new Aluno(escolaridadeMedio, cidade, curso);
        assertEquals("Paulo", aluno.getNomeCoordenadorCurso());
    }
}