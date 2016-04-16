package chainOfResponsability.ex2;

public class MainChainEx2 {

	public static void main(String[] args) {

		HandlerRequestChain handlers = new Handler1();
		handlers.setNext(new Handler2());
		handlers.setNext(new Handler3());
		handlers.setNext(new Handler4());
		handlers.setNext(new Handler5());
		handlers.setNext(new Handler6());
		handlers.setNext(new Handler7());
		handlers.setNext(new Handler8());
		handlers.setNext(new Handler9());
		handlers.setNext(new Handler10());
		handlers.setNext(new Handler11());
		handlers.setNext(new Handler12());
		handlers.setNext(new Handler13());
		handlers.setNext(new Handler14());
		handlers.setNext(new Handler15());

		try {
			handlers.tratarRequisicao(IHandler.HL1);
			handlers.tratarRequisicao(IHandler.HL2);
			handlers.tratarRequisicao(IHandler.HL3);
			handlers.tratarRequisicao(IHandler.HL4);
			handlers.tratarRequisicao(IHandler.HL5);
			handlers.tratarRequisicao(IHandler.HL6);
			handlers.tratarRequisicao(IHandler.HL7);
			handlers.tratarRequisicao(IHandler.HL8);
			handlers.tratarRequisicao(IHandler.HL9);
			handlers.tratarRequisicao(IHandler.HL10);
			handlers.tratarRequisicao(IHandler.HL11);
			handlers.tratarRequisicao(IHandler.HL12);
			handlers.tratarRequisicao(IHandler.HL13);
			handlers.tratarRequisicao(IHandler.HL14);
			handlers.tratarRequisicao(IHandler.HL15);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
