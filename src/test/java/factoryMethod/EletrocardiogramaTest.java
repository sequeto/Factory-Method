package factoryMethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class EletrocardiogramaTest {

	@Test
    public void realizarEletrocardiogramaTeste() {
        Exame exame = ExamesFactory.criarExame("Eletrocardiograma");
        assertEquals("Eletrocardiograma Realizado", exame.realizarExame());
    }
	
	@Test
    public void realizarPagamentoDeEletrocardiogramaTeste() {
        Exame exame = ExamesFactory.criarExame("Eletrocardiograma");
        assertEquals("Pagamento Realizado com Sucesso", exame.realizarPagamento());
    }

}
