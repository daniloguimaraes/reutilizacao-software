package builder.ex2;

public class Director<T extends ContatoBaseBuilder> {
	
	ContatoBaseBuilder contatoBuilder;

	public Director(T contatoBuilder) {
		this.contatoBuilder = contatoBuilder;
	}
	
	public ContatoInternet criarContatoInternet() {
		return null;
	}
	
	public ContatoTelefone criarContatoTelefone() {
		return null;
	}
	
	public ContatoCompleto criarContatoCompleto() {
		return null;
	}
}
