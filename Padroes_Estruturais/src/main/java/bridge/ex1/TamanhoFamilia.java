package bridge.ex1;

public class TamanhoFamilia extends AbstractTamanho {

	public TamanhoFamilia(Refrigerante refri) {
		super(refri);
	}

	@Override
	public void beber() {
		System.out.println("Abrindo " + refri + " tamanho familia");
		System.out.println("Toma um gole de " + refri);
		System.out.println("E nao acaba nunca...");

	}

}
