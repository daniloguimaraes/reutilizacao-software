package chainOfResponsability.ex2;

public class Handler13 extends HandlerRequestChain {

	public Handler13() {
		super(IHandler.HL13);

	}

	@Override
	protected void handleRequest() {
		System.out.println("handler requested 13");
	}

}
