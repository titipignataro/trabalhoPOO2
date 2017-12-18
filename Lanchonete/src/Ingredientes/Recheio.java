package Ingredientes;

// Decorator
public abstract class Recheio {
	String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public abstract double calcularPreco();

}
