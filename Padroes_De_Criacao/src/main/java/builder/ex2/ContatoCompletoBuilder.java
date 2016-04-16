package builder.ex2;

public class ContatoCompletoBuilder extends ContatoBaseBuilder {
	
	public ContatoCompletoBuilder() {
		contato = new ContatoCompleto();
	}
	
	@Override
	public ContatoBuilder endereco(String endereco) {
		((ContatoCompleto) contato).setEndereco(endereco);
		return this;
	}
	
	@Override
	public ContatoBuilder telefone(String telefone) {
		((ContatoCompleto) contato).setTelefone(telefone);
		return this;
	}
	
	@Override
	public ContatoBuilder email(String email) {
		((ContatoCompleto) contato).setEmail(email);
		return this;
	}
	

}
