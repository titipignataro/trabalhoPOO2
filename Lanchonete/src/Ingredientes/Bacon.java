package Ingredientes;

public class Bacon extends AdicionalLanche {

	public Bacon(Recheio recheio) {
		super(recheio);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + ",Bacon";
	}

	@Override
	public double calcularPreco() {
		return super.calcularPreco() + (double) 1.00;
	}

}
