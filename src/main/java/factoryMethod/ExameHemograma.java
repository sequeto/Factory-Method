package factoryMethod;

public class ExameHemograma implements Exame{
	public String realizarExame() {
		return "Hemograma Realizado";
	}
	
	public String realizarPagamento() {
		return "Pagamento Realizado com Sucesso";
	}
}
