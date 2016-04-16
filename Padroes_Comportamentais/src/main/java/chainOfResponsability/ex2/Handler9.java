package chainOfResponsability.ex2;

public class Handler9 extends HandlerRequestChain {

	public Handler9() {
		super(IHandler.HL9);

	}

	@Override
	protected void handleRequest() {
		System.out.println("handler requested 9 ");
	}

}
