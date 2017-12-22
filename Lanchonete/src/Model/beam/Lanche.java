package Model.beam;

import Ingredientes.Queijo;
import Ingredientes.Recheio;
import Memento.LancheMemento;

public class Lanche extends Produto {

	String tamanho;
	Queijo queijo;
	Recheio recheio;

	public Lanche() {
		this.tipo = "lanche";
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public void setRecheio(Recheio r) {
		recheio = r;
	}

	public Recheio getRecheio() {
		return recheio;
	}

	public Queijo getQueijo() {
		return queijo;
	}

	public void setQueijo(Queijo queijo) {
		this.queijo = queijo;
	}

	@Override
	public String getDescricao() {
		descricao = "Lanche " + tamanho + "," + "Queijo " + queijo.toString();
		descricao = descricao + "," + recheio.getDescricao();
		return descricao;
	}

	@Override
	public double getPreco() {
		double precoTotal = this.recheio.calcularPreco();
		if (tamanho.equals("Grande")) {
			precoTotal += (double) 6.00;
		} else if (tamanho.equals("Medio")) {
			precoTotal += (double) 3.50;
		} else {
			precoTotal += (double) 2.00;
		}
		return precoTotal;
	}

	public void setDescricao() {
            descricao = "Lanche " + tamanho + "," + "Queijo " + queijo.toString();
            descricao = descricao + "," + recheio.getDescricao();
	}

	public void setPreco() {
		double precoTotal = this.recheio.calcularPreco();
		if (tamanho.equals("Grande")) {
			precoTotal += (double) 6.00;
		} else if (tamanho.equals("Medio")) {
			precoTotal += (double) 3.50;
		} else {
			precoTotal += (double) 2.00;
		}
                this.preco = precoTotal;
	}

        
        public LancheMemento gerarMemento(){
            return new LancheMemento(preco,tipo,descricao,tamanho,queijo,recheio);
        }
}
