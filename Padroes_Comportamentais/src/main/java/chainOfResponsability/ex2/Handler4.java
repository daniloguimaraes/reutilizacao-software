package chainOfResponsability.ex2;

public class Handler4 extends HandlerRequestChain {

	public Handler4() {
		super(IHandler.HL4);

	}

	@Override
	protected void handleRequest() {
		System.out.println("handler requested 4 ");
	}

}
