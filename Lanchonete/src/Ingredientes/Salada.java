package Ingredientes;

public class Salada extends AdicionalLanche {

	public Salada(Recheio recheio) {
		super(recheio);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + ",Alface, Tomate e Rúcula";
	}

	@Override
	public double calcularPreco() {
		return super.calcularPreco();
	}

}
