package Ingredientes;

// Factory de Adicionais
public class AdicionaisFactory implements IngredientesFactory {

	// Singleton
	private static AdicionaisFactory instancia;

	private AdicionaisFactory() {
	}

	// Singleton usando synchronized, para apenas um thread poder acessa-lo.
	// Usando o padrão Double-checked locking, melhorando a performance do método ao
	// usar o synchronized.
	public static AdicionaisFactory getInstance() {

		if (instancia == null) {
			synchronized (AdicionaisFactory.class) {
				if (instancia == null) {
					instancia = new AdicionaisFactory();
				}
			}
		}

		return instancia;
	}

	@Override
	public Recheio getRecheio(String descricao) {
		return null;
	}

	// Neste caso, será um abstract factory para uma classe do tipo Decorator.
	// Dentro da própria fábrica, já pode decorar o adicional através do segundo
	// atributo da função getAdicionais, o qual poderá usar o factory para
	// implementar um Recheio ou um Adicional neste segundo atributo.
	// Use o factory com descrição no segundo atributo
	// ou deixe null.
	@Override
	public AdicionalLanche getAdicionais(String descricao, Recheio recheio) {

		if (descricao == null) {
			return null;
		}

		if (descricao.equalsIgnoreCase("BACON")) {
			return new Bacon(recheio);
		}

		else if (descricao.equalsIgnoreCase("CREAMCHEESE")) {
			return new CreamCheese(recheio);
		}

		else if (descricao.equalsIgnoreCase("OVO")) {
			return new Ovo(recheio);
		}

		else if (descricao.equalsIgnoreCase("SALADA")) {
			return new Salada(recheio);
		}

		return null;
	}

}
