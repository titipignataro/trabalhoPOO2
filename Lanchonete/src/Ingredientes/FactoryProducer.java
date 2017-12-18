package Ingredientes;

// Classe para decidir qual factory escolher.
public class FactoryProducer {

	public static IngredientesFactory getFactory(String escolha) {

		if (escolha.equalsIgnoreCase("RECHEIO")) {
			return RecheioFactory.getInstance();
		}

		else if (escolha.equalsIgnoreCase("ADICIONAL")) {
			return AdicionaisFactory.getInstance();
		}

		return null;
	}
}
