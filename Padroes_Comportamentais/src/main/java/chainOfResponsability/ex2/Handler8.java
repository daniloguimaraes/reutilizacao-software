package chainOfResponsability.ex2;

public class Handler8 extends HandlerRequestChain {

	public Handler8() {
		super(IHandler.HL8);

	}

	@Override
	protected void handleRequest() {
		System.out.println("handler requested 8 ");
	}

}
