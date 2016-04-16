package chainOfResponsability.ex2;

public class Handler3 extends HandlerRequestChain {

	
	public Handler3() {
		super(IHandler.HL3);
		
	}

	@Override
	protected void handleRequest() {
		System.out.println("handler requested 3 ");
	}

}
