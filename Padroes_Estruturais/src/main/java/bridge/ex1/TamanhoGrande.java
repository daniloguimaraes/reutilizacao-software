package bridge.ex1;

public class TamanhoGrande extends AbstractTamanho {

	public TamanhoGrande(Refrigerante refri) {
		super(refri);
	}

	@Override
	public void beber() {
		System.out.println("Abrindo " + refri + " grande");
		System.out.println("Toma um gole de " + refri);
		System.out.println("Toma um gole de " + refri);
		System.out.println("Toma um gole de " + refri);
		System.out.println("Acabou...");
		System.out.println();
		
	}


}
