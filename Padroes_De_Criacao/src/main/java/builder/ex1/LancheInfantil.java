package builder.ex1;

/**
 * Representa o pedido de um lanche infantil.
 * 
 * @author Danilo Guimarães
 *
 */
public class LancheInfantil {
	
	private Sanduiche sanduiche;
	private Batata batata;
	private Brinquedo brinquedo;
	private Refri refri;
	
	public Sanduiche getSanduiche() {
		return sanduiche;
	}
	public void setSanduiche(Sanduiche sanduiche) {
		this.sanduiche = sanduiche;
	}
	public Batata getBatata() {
		return batata;
	}
	public void setBatata(Batata batata) {
		this.batata = batata;
	}
	public Brinquedo getBrinquedo() {
		return brinquedo;
	}
	public void setBrinquedo(Brinquedo brinquedo) {
		this.brinquedo = brinquedo;
	}
	public Refri getRefri() {
		return refri;
	}
	public void setRefri(Refri refri) {
		this.refri = refri;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Sanduiche: " + getSanduiche())
			.append(" | Batata: " + getBatata())
			.append(" | Brinquedo : " + getBrinquedo())
			.append(" | Refrigerante : " + getRefri());
		return sb.toString();
	}
	
		
	

}
