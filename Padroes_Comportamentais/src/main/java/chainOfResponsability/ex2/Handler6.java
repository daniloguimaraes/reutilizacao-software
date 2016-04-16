package chainOfResponsability.ex2;

public class Handler6 extends HandlerRequestChain {

	public Handler6() {
		super(IHandler.HL6);

	}

	@Override
	protected void handleRequest() {
		System.out.println("handler requested 6 ");
	}

}
