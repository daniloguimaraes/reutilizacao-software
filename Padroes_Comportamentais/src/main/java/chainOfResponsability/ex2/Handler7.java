package chainOfResponsability.ex2;

public class Handler7 extends HandlerRequestChain {

	public Handler7() {
		super(IHandler.HL7);

	}

	@Override
	protected void handleRequest() {
		System.out.println("handler requested 7 ");
	}

}
