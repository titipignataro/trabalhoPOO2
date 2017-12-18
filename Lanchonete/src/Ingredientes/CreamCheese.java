package Ingredientes;

public class CreamCheese extends AdicionalLanche {

	public CreamCheese(Recheio recheio) {
		super(recheio);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + ",Cream Cheese";
	}

	@Override
	public double calcularPreco() {
		return super.calcularPreco() + (double) 1.00;
	}

}
