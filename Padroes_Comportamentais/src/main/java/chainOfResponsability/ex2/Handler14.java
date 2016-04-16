package chainOfResponsability.ex2;

public class Handler14 extends HandlerRequestChain {

	public Handler14() {
		super(IHandler.HL14);

	}

	@Override
	protected void handleRequest() {
		System.out.println("handler requested 14");
	}

}
