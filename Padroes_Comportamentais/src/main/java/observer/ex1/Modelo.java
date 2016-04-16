package observer.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Modelo único para todos os componentes gráficos.
 * 
 * @author Vítor Souza
 * @version 2005.07.21
 */
public class Modelo extends Observable {
	/** Valor do modelo. */
	private int valor;
	private List<Observer> observers = new ArrayList<Observer>();

	/** Getter for valor. */
	public int getValor() {
		return valor;
	}

	/** Setter for valor. */
	public void setValor(int valor) {
		this.valor = valor;
		notifyObservers();
	}

	@Override
	public synchronized void addObserver(Observer o) {
		// TODO Auto-generated method stub
		super.addObserver(o);
		observers.add(o);
	}

	@Override
	public synchronized void deleteObserver(Observer o) {
		// TODO Auto-generated method stub
		super.deleteObserver(o);
		observers.remove(0);
	}

	@Override
	public void notifyObservers() {
		super.notifyObservers();
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update(this, this);
		}
	}

}
