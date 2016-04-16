package chainOfResponsability.ex2;

public class Handler10 extends HandlerRequestChain {

	
	public Handler10() {
		super(IHandler.HL10);
		
	}

	@Override
	protected void handleRequest() {
		System.out.println("handler requested 10");
	}

}
