package bridge.ex1;

public class TamanhoMedio extends AbstractTamanho {

	public TamanhoMedio(Refrigerante refri) {
		super(refri);
	}

	@Override
	public void beber() {
		System.out.println("Abrindo " + refri + " med");
		System.out.println("Toma um gole de " + refri);
		System.out.println("Toma um gole de " + refri);
		System.out.println("Acabou...");
		System.out.println();
	}

	

}
