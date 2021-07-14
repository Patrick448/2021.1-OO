import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    Estado estado;
    Cidade cidade;
    Escolaridade escolaridade;

    @BeforeEach
    void setup(){
         estado = new Estado("Amazonas");
         cidade = new Cidade(estado, "Manaus");
         escolaridade = new Escolaridade("Mestrado");

    }

    @Test
    void deveRetornarEscolaridadeProfessor() {
        Professor professor = new Professor(escolaridade, cidade);
        assertEquals("Mestrado", professor.getDescriçãoEscolaridade());
    }

    @Test
    void deveRetornarNomeCidadeNaturalidade() {
        Professor professor = new Professor(escolaridade, cidade);
        assertEquals("Manaus", professor.getNomeCidadeNaturalidade());
    }

    @Test
    void deveRetornarDescricaoTipoEnsinoCursoContratado() {
        Professor coordenador = new Professor(escolaridade, cidade);
        Professor diretor = new Professor(escolaridade, cidade);

        TipoEnsino tipoEnsino = new TipoEnsino("Medio");
        Escola escola = new Escola(diretor, cidade);

        Curso curso = new Curso(coordenador, tipoEnsino, escola);

        Professor professor = new Professor(escolaridade, cidade);
        professor.setCursoContratado(curso);

        assertEquals("Medio", professor.getDescricaoTipoEnsinoCursoContratado());
    }

    @Test
    void deveRetornarNomeCoordenador() {

        Professor coordenador = new Professor(escolaridade, cidade);
        coordenador.setNome("José");
        Professor diretor = new Professor(escolaridade, cidade);

        TipoEnsino tipoEnsino = new TipoEnsino("Medio");
        Escola escola = new Escola(diretor, cidade);

        Curso curso = new Curso(coordenador, tipoEnsino, escola);

        Professor professor = new Professor(escolaridade, cidade);
        professor.setCursoContratado(curso);

        assertEquals("José", professor.getNomeCoordenador());
    }

    @Test
    void deveRetornarNomeDiretor() {

        Professor coordenador = new Professor(escolaridade, cidade);
        Professor diretor = new Professor(escolaridade, cidade);
        diretor.setNome("Renato");

        TipoEnsino tipoEnsino = new TipoEnsino("Medio");
        Escola escola = new Escola(diretor, cidade);

        Curso curso = new Curso(coordenador, tipoEnsino, escola);

        Professor professor = new Professor(escolaridade, cidade);
        professor.setCursoContratado(curso);

        assertEquals("Renato", professor.getNomeDiretor());
    }

    @Test
    void deveRetornarExcessaoProfessorNaoFoiContratado() {

        try{
            Professor diretor = new Professor(escolaridade, cidade);
            diretor.getNomeDiretor();

            fail();
        }catch(Exception e){
            assertEquals("Professor nao foi contratado para um curso", e.getMessage());
        }

    }

    @Test
    void deveRetornarExcessaoProfessorNaoFoiContratado2() {

        try{
            Estado estado = new Estado("Amazonas");
            Cidade cidade = new Cidade(estado, "Manaus");

            Escolaridade escolaridade = new Escolaridade("Mestrado");
            Professor coordenador = new Professor(escolaridade, cidade);
            coordenador.getNomeCoordenador();

            fail();
        }catch(Exception e){
            assertEquals("Professor nao foi contratado para um curso", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcessaoProfessorNaoFoiContratado3() {

        try{
            Estado estado = new Estado("Amazonas");
            Cidade cidade = new Cidade(estado, "Manaus");

            Escolaridade escolaridade = new Escolaridade("Mestrado");
            Professor coordenador = new Professor(escolaridade, cidade);
            coordenador.getDescricaoTipoEnsinoCursoContratado();

            fail();
        }catch(Exception e){
            assertEquals("Professor nao foi contratado para um curso", e.getMessage());
        }

    }
}