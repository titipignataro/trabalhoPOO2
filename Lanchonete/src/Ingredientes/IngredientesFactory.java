package Ingredientes;

// Interface base dos Factory
public interface IngredientesFactory {

	public Recheio getRecheio(String descricao);

	// Neste caso, será um abstract factory para uma classe do tipo Decorator.
	// Dentro da própria fábrica, já pode decorar o adicional através do segundo
	// atributo da função getAdicionais, o qual poderá usar o factory para
	// implementar um Recheio ou um Adicional neste segundo atributo.
	// Use o factory com descrição no segundo atributo
	// ou deixe null. 
	public AdicionalLanche getAdicionais(String descricao, Recheio recheio);

}