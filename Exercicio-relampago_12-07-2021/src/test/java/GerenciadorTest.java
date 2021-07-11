import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GerenciadorTest {

    Aluno aluno;
    Professor professor;
    Professor coordenador;
    Professor diretor;
    Escola escola;
    Curso curso;

    @BeforeEach
    void setup(){
        Estado estado = new Estado("Amazonas");
        Cidade cidade = new Cidade(estado, "Manaus");
        Escolaridade escolaridadeMedio = new Escolaridade("Medio");
        Escolaridade escolaridadeSuperior = new Escolaridade("Superior");
        TipoEnsino tipoEnsinoMedio = new TipoEnsino("Ensino Medio");

        diretor = new Professor();
        diretor.setNome("Helena");
        diretor.setEscolaridade(escolaridadeSuperior);
        diretor.setNaturalidade(cidade);

        coordenador = new Professor();
        coordenador.setNome("Geraldo");
        coordenador.setEscolaridade(escolaridadeSuperior);
        coordenador.setEscolaridade(escolaridadeSuperior);
        coordenador.setNaturalidade(cidade);

        escola = new Escola();
        escola.setCidade(cidade);
        escola.setDiretor(diretor);

        curso = new Curso();
        curso.setCoordenador(coordenador);
        curso.setEscola(escola);
        curso.setTipoEnsino(tipoEnsinoMedio);

        professor = new Professor();
        professor.setCursoContratado(curso);
        professor.setNaturalidade(cidade);
        professor.setEscolaridade(escolaridadeSuperior);

        aluno = new Aluno();
        aluno.setNaturalidade(cidade);
        aluno.setCurso(curso);
    }

    @Test
    void deveRetornarEscolaridadeProfessor() {
        assertEquals("Superior", Gerenciador.getEscolaridade(professor).getNivel());
    }

    @Test
    void deveRetornarEscolaridadeCoordenador() {
        assertEquals("Superior", Gerenciador.getEscolaridadeCoordenador(curso).getNivel());
    }

    @Test
    void deveRetornarEscolaridadeDiretor() {
        assertEquals("Superior", Gerenciador.getEscolaridadeDiretor(escola).getNivel());
    }

    @Test
    void deveRetornarEstadoNaturalidadeAluno() {
        assertEquals("Amazonas", Gerenciador.getNaturalidadeEstado(aluno).getNome());
    }

    @Test
    void deveRetornarCidadeNaturalidadeProfessor() {
        assertEquals("Manaus", Gerenciador.getNaturalidadeCidade(professor).getNome());
    }

    @Test
    void deveRetornarEstadoMatriculaAluno() {
        assertEquals("Amazonas", Gerenciador.getEstadoMatricula(aluno).getNome());
    }

    @Test
    void deveRetornarTipoEnsinoProfessor() {
        assertEquals("Ensino Medio", Gerenciador.getTipoEnsino(professor).getTipo());
    }

    @Test
    void deveRetornarCoordenadorAluno() {
        assertEquals("Geraldo", Gerenciador.getCoordenador(aluno).getNome());
    }

    @Test
    void deveRetornarDiretorProfessor() {
        assertEquals("Helena", Gerenciador.getDiretor(professor).getNome());
    }

    @Test
    void deveRetornarCoordenadorProdessor() {
        assertEquals("Geraldo", Gerenciador.getCoordenador(professor).getNome());
    }
}