package builder.ex1;

/**
 * O funcionário da PatternBurgers responsável por montar o pedido do lanche infantil. 
 *  
 * @author Danilo Guimarães
 *
 */
public class LancheInfantilBuilder {
	
	private LancheInfantil lanche;
	
	/**
	 * Construtor padrão.
	 */
	public LancheInfantilBuilder() {
		lanche = new LancheInfantil();
	}
	
	/**
	 * Adiciona o sanduiche ao lanche infantil.
	 * 
	 * @param sanduiche o tipo do sanduiche
	 * @return o próprio builder
	 */
	public LancheInfantilBuilder sanduiche(Sanduiche sanduiche) {
		lanche.setSanduiche(sanduiche);
		return this;
	}
	
	/**
	 * Adiciona a batata ao lanche infantil.
	 * 
	 * @param batata o tipo da batata
	 * @return o próprio builder
	 */
	public LancheInfantilBuilder batata(Batata batata) {
		lanche.setBatata(batata);
		return this;
	}
	
	/**
	 * Adiciona o brinquedo ao lanche infantil.
	 * 
	 * @param brinquedo o tipo do brinquedo
	 * @return o próprio builder
	 */
	public LancheInfantilBuilder brinquedo(Brinquedo brinquedo) {
		lanche.setBrinquedo(brinquedo);
		return this;
	}
	
	/**
	 * Adiciona o refrigerante ao lanche infantil.
	 * 
	 * @param refrigerante o tipo do refrigerante
	 * @return o próprio builder
	 */
	public LancheInfantilBuilder refri(Refri refri) {
		lanche.setRefri(refri);
		return this;
	}
	
	/**
	 * @return o pedido infantil que foi construído.
	 */
	public LancheInfantil build() {
		return lanche;
	}
	
	

}
