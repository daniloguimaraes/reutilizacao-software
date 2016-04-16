package chainOfResponsability.ex2;

public class Handler11 extends HandlerRequestChain {

	public Handler11() {
		super(IHandler.HL11);

	}

	@Override
	protected void handleRequest() {
		System.out.println("handler requested 11");
	}

}
