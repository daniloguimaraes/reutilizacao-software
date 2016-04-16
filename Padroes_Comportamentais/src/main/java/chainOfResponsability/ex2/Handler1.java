package chainOfResponsability.ex2;

public class Handler1 extends HandlerRequestChain {

	public Handler1() {
		super(IHandler.HL1);

	}

	@Override
	protected void handleRequest() {
		System.out.println("handler requested 1 ");
	}

}
