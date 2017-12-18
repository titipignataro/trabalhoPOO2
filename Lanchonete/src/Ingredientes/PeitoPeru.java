package Ingredientes;

public class PeitoPeru extends Recheio {

	public PeitoPeru() {
		descricao = "Peito de Peru";
	}

	@Override
	public double calcularPreco() {
		return (float) 14.50;
	}

}
