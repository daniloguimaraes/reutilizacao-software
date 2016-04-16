package chainOfResponsability.ex2;

public abstract class HandlerRequestChain {

	protected HandlerRequestChain next;
	protected IHandler identificadorDoHandler;

	public HandlerRequestChain(IHandler id) {
		next = null;
		identificadorDoHandler = id;
	}

	public void setNext(HandlerRequestChain forma) {
		if (next == null) {
			next = forma;
		} else {
			next.setNext(forma);
		}
	}

	public void tratarRequisicao(IHandler id) throws Exception {
		if (podeTratarRequisicao(id)) {
			handleRequest();
		} else {
			if (next == null) {
				throw new Exception("Handler não encontrado");
			}
			next.tratarRequisicao(id);
		}
	}

	private boolean podeTratarRequisicao(IHandler id) {
		if (identificadorDoHandler == id) {
			return true;
		}
		return false;
	}

	protected abstract void handleRequest();

}
