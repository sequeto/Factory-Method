package factoryMethod;

public class ExameEletrocardiograma implements Exame {
	public String realizarExame() {
		return "Eletrocardiograma Realizado";
	}
	
	public String realizarPagamento() {
		return "Pagamento Realizado com Sucesso";
	}

}
