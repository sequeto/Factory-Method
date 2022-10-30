package factoryMethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class HemogramaTest {
	@Test
    public void realizarHemogramaTeste() {
        Exame exame = ExamesFactory.criarExame("Hemograma");
        assertEquals("Hemograma Realizado", exame.realizarExame());
    }
	
	@Test
    public void realizarPagamentoDeHemogramaTeste() {
        Exame exame = ExamesFactory.criarExame("Hemograma");
        assertEquals("Pagamento Realizado com Sucesso", exame.realizarPagamento());
    }
}
