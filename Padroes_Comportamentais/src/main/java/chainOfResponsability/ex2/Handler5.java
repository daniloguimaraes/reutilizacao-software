package chainOfResponsability.ex2;

public class Handler5 extends HandlerRequestChain {

	public Handler5() {
		super(IHandler.HL5);

	}

	@Override
	protected void handleRequest() {
		System.out.println("handler requested 5 ");
	}

}
