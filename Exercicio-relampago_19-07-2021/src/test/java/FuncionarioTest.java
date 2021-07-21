import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarNomePaisAlocacao() {
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado(pais);
        Cidade cidade = new Cidade(estado);
        Empresa empresa = new Empresa();
        Filial filial = new Filial(cidade, empresa);
        Funcionario funcionario = new Funcionario(filial);

        assertEquals("Brasil", funcionario.getNomePaisAlocacao());
    }

    @Test
    void deveRetornarExcecaoFuncionarioSemFilial() {
        try{
            Funcionario funcionario = new Funcionario();
            funcionario.getNomePaisAlocacao();
            fail();

        }catch (NullPointerException e){
            assertEquals("funcionario sem filial",e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeEstadoFilialCoordena() {
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado(pais);
        Cidade cidade = new Cidade(estado);
        Empresa empresa = new Empresa();

        Filial filial = new Filial(cidade, empresa);
        Funcionario funcionario = new Funcionario(filial);

        assertEquals("Brasil", funcionario.getNomePaisAlocacao());
    }

    @Test
    void deveRetornarNomeEstadoFilialCoordenacao() {
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado(pais);
        estado.setNome("MG");
        Cidade cidade = new Cidade(estado);
        Empresa empresa = new Empresa();

        Filial filial = new Filial(cidade, empresa);
        Funcionario funcionario = new Funcionario();
        funcionario.setFilialCoodenacao(filial);

        assertEquals("MG", funcionario.getNomeEstadoFilialCoordenacao());
    }

    @Test
    void deveRetornarFuncionarioNaoCoordenaFilial() {

        Funcionario funcionario = new Funcionario();

        assertEquals("funcionario nao coordena filial", funcionario.getNomeEstadoFilialCoordenacao());
    }




}