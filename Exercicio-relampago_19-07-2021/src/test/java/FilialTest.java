import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {

    @Test
    void deveRetornarNomePais() {
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado(pais);
        Cidade cidade = new Cidade(estado);
        Empresa empresa = new Empresa();
        Filial filial = new Filial(cidade, empresa);

        assertEquals("Brasil", filial.getNomePais());
    }

    @Test
    void deveRetornarExcecaoFilialSemCidade() {
        try{
            Filial filial = new Filial();
            filial.getNomePais();
            fail();

        }catch (NullPointerException e){
            assertEquals("filial sem cidade", e.getMessage());
        }
    }


    @Test
    void deveRetornarNomeDiretorEmpresa() {
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado(pais);
        Cidade cidade = new Cidade(estado);

        Funcionario diretor = new Funcionario();
        diretor.setNome("Roberto");

        Empresa empresa = new Empresa();
        empresa.setDiretor(diretor);


        Filial filial = new Filial(cidade, empresa);


        assertEquals("Roberto", filial.getNomeDiretorEmpresa());
    }

    @Test
    void deveRetornarExcecaoFilialSemEmpresa() {
        try{
            Filial filial = new Filial();
            filial.getNomeDiretorEmpresa();
            fail();

        }catch (NullPointerException e){
            assertEquals("filial sem empresa", e.getMessage());
        }
    }



}