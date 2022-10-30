package factoryMethod;

public class ExamesFactory {
	@SuppressWarnings("deprecation")
	public static Exame criarExame(String exame){
		@SuppressWarnings("rawtypes")
		Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factoryMethod.Exame" + exame);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Exame inexistente");
        }
        if (!(objeto instanceof Exame)) {
            throw new IllegalArgumentException("Exame inválido");
        }
        return (Exame) objeto;
    }
}
