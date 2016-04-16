package chainOfResponsability.ex2;

public class Handler15 extends HandlerRequestChain {

	public Handler15() {
		super(IHandler.HL15);

	}

	@Override
	protected void handleRequest() {
		System.out.println("handler requested 15");
	}

}
