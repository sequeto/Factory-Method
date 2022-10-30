package factoryMethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryTest {
	
	@Test
	public void excecaoExameInexistente() {
        try {
            Exame exame = ExamesFactory.criarExame("Ecocardiograma");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Exame inexistente", e.getMessage());
        }
    }
}
