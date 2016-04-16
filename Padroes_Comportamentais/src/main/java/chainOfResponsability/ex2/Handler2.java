package chainOfResponsability.ex2;

public class Handler2 extends HandlerRequestChain {

	public Handler2() {
		super(IHandler.HL2);

	}

	@Override
	protected void handleRequest() {
		System.out.println("handler requested 2 ");
	}

}
