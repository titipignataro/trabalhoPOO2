package Ingredientes;

public class PeitoFrango extends Recheio {

	public PeitoFrango() {
		descricao = "Peito de Frango";
	}

	@Override
	public double calcularPreco() {
		return (float) 10.00;
	}

}
