package bridge.ex1;

public class TamanhoPequeno extends AbstractTamanho {

	public TamanhoPequeno(Refrigerante refri) {
		super(refri);
	}

	@Override
	public void beber() {
		System.out.println("Abrindo " + refri + " peq");
		System.out.println("Toma um gole de " + refri);
		System.out.println("Acabou...");
		System.out.println();
	}

}
