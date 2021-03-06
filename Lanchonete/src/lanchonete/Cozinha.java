package lanchonete;

import java.util.List;

import Ingredientes.Queijo;
import Ingredientes.Recheio;
import Model.beam.Lanche;

import java.util.ArrayList;

public class Cozinha implements Observable {

	private List<Observer> observers = new ArrayList<>();
	private Lanche lanche;
	private boolean pedidoPronto;

	public void prepararPedido(String tamanho, String tipoQueijo, String recheio) {

		Queijo queijo = null;

		for (Queijo q : Queijo.values()) {
			if (tipoQueijo.equalsIgnoreCase(q.name())) {
				queijo = q;
			}
		}

		if (queijo == null) {
			queijo = Queijo.SEM;
		}

	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer ob : observers) {
			System.out.println("Notificando observers!");
			ob.update(this.pedidoPronto);
		}
	}

}
