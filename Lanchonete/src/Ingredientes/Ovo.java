package Ingredientes;

public class Ovo extends AdicionalLanche {

	public Ovo(Recheio recheio) {
		super(recheio);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + ",Ovo";
	}

	@Override
	public double calcularPreco() {
		return super.calcularPreco() + (double) 1.00;
	}

}
