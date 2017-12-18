package Ingredientes;

// Factory de Recheios
public class RecheioFactory implements IngredientesFactory {

	// Singleton
	private static RecheioFactory instancia;

	private RecheioFactory() {
	}

	// Singleton usando synchronized, para apenas um thread poder acessa-lo.
	// Usando o padrão Double-checked locking, melhorando a performance do método ao
	// usar o synchronized.
	public static RecheioFactory getInstance() {

		if (instancia == null) {
			synchronized (RecheioFactory.class) {
				if (instancia == null) {
					instancia = new RecheioFactory();
				}
			}
		}

		return instancia;
	}

	@Override
	public Recheio getRecheio(String descricao) {
		
		if(descricao == null) {
			return null;
		}
		
		else if(descricao.equalsIgnoreCase("HAMBURGER")) {
			return new Hamburger();
		}
		
		else if(descricao.equalsIgnoreCase("PEITOFRANGO")) {
			return new PeitoFrango();
		}
		
		else if(descricao.equalsIgnoreCase("PEITOPERU")) {
			return new PeitoPeru();
		}

		return null;
	}

	@Override
	public AdicionalLanche getAdicionais(String descricao, Recheio recheio) {
		return null;
	}
}
