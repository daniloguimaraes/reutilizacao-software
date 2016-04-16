package abstractFactory.ex2;

/**
 * 
 * @author Danilo Guimarães
 *
 */
public class PizzaFactory implements FabricaRefeicao {

	public Pizza prepararPizzaPresunto() {
		return new PizzaPresunto();
	}

	public Pizza prepararPizzaCalabresa() {
		return new PizzaCalabresa();
	}

	public Calzone prepararCalzoneCalabresa() {
		// Nao sei preparar calzones...
		return null;
	}

	public Calzone prepararCalzonePresunto() {
		// Nao sei preparar calzones...
		return null;
	}

}
