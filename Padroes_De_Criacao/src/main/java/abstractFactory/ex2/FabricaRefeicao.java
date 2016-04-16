package abstractFactory.ex2;

/**
 * Fabrica abstraca de refeições.
 * 
 * @author Danilo Guimarães
 *
 */
public interface FabricaRefeicao {
	
	/**
	 * @return uma pizza de calabresa
	 */
	Pizza prepararPizzaCalabresa();
	
	/**
	 * @return uma pizza de presunto
	 */
	Pizza prepararPizzaPresunto();
	
	/**
	 * @return um calzone de calabresa
	 */
	Calzone prepararCalzoneCalabresa();
	
	/**
	 * @return um calzone de presunto
	 */
	Calzone prepararCalzonePresunto();

}
