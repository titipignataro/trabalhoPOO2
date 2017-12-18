package lanchonete;

public interface Observable {

	public void registerObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObservers(int numero);

}
