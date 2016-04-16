package builder.ex2;

public class ContatoInternetBuilder extends ContatoBaseBuilder {
	

	
	public ContatoInternetBuilder() {
		contato = new ContatoInternet();
	}
	
	public ContatoInternetBuilder email(String email) {
		((ContatoInternet) contato).setEmail(email);
		return this;
	}
	
	public ContatoInternet build() {
		return (ContatoInternet) contato;
	}
	

}
