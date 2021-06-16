import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa pessoa;

    @BeforeEach
    void setup(){
        pessoa = new Pessoa();

    }
    @Test
    void deveRetornarNome() {
        pessoa.setNome("Maria da Silva");
        assertEquals("Maria da Silva", pessoa.getNome());
    }


}