package Ingredientes;

// Decorator dos adicionais do lanche
public abstract class AdicionalLanche extends Recheio {
	protected Recheio recheio;

	public AdicionalLanche(Recheio recheio) {
		this.recheio = recheio;
	}

	public String getDescricao() {
		return recheio.getDescricao();
	}

	public void setDescricao(String descricao) {
		recheio.setDescricao(descricao);
	}

	public double calcularPreco() {
		return recheio.calcularPreco();
	}
}
