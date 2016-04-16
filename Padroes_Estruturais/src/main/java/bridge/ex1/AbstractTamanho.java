package bridge.ex1;

public abstract class AbstractTamanho {
	
	protected Refrigerante refri;
	
	public AbstractTamanho(Refrigerante refri) {
		this.refri = refri;
		
	}
	
	public abstract void beber();

}
