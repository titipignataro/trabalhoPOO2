package Ingredientes;

public enum Queijo {
	CHEDDAR(1.50), PRATO(1.00), SUICO(1.00), SEM(0);

	private final double preco;
	Queijo(double preco) {
		this.preco = preco;
	}
	
	public double calcularPreco() {
		return this.preco;
	}
}