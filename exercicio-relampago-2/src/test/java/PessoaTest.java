import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarAbaixoPesoF() {
        Pessoa pessoa = new Pessoa("F", 19.099f, 1.0f);
        assertEquals("abaixo do peso", pessoa.calcularImc());

    }

    @Test
    void deveRetornarPesoNormalF() {
        Pessoa pessoa = new Pessoa("F", 25.799f, 1.0f);
        assertEquals("no peso normal", pessoa.calcularImc());
    }

    @Test
    void deveRetornarMarginalmenteAcimaPesoF() {
        Pessoa pessoa = new Pessoa("F", 27.299f, 1.0f);
        assertEquals("marginalmente acima do peso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarAcimaPesoF() {
        Pessoa pessoa = new Pessoa("F", 32.299f, 1.0f);
        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }

    @Test
    void deveRetornarObesoF() {
        Pessoa pessoa = new Pessoa("F", 32.300f, 1.0f);
        assertEquals("obeso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarAbaixoPesoM() {
        Pessoa pessoa = new Pessoa("M", 20.699f, 1.0f);
        assertEquals("abaixo do peso", pessoa.calcularImc());

    }

    @Test
    void deveRetornarPesoNormalM() {
        Pessoa pessoa = new Pessoa("M", 26.399f, 1.0f);
        assertEquals("no peso normal", pessoa.calcularImc());
    }

    @Test
    void deveRetornarMarginalmenteAcimaPesoM() {
        Pessoa pessoa = new Pessoa("M", 27.799f, 1.0f);
        assertEquals("marginalmente acima do peso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarAcimaPesoM() {
        Pessoa pessoa = new Pessoa("M", 31.099f, 1.0f);
        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }

    @Test
    void deveRetornarObesoM() {
        Pessoa pessoa = new Pessoa("M", 31.100f, 1.0f);
        assertEquals("obeso", pessoa.calcularImc());
    }
}