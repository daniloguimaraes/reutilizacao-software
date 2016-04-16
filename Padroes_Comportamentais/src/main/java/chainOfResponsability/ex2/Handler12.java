package chainOfResponsability.ex2;

public class Handler12 extends HandlerRequestChain {

	public Handler12() {
		super(IHandler.HL12);

	}

	@Override
	protected void handleRequest() {
		System.out.println("handler requested 12");
	}

}
