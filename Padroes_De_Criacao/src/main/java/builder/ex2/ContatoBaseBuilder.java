package builder.ex2;

public class ContatoBaseBuilder implements ContatoBuilder {
	
	protected ContatoBase contato;
	
	public ContatoBaseBuilder() {
		contato = new ContatoBase();
	}
	
	public ContatoBaseBuilder nome(String nome) {
		contato.setNome(nome);
		return this;
	}
	
	public ContatoBuilder telefone(String telefone) {
		return this;
	}

	public ContatoBuilder email(String email) {
		return this;
	}

	public ContatoBuilder endereco(String endereco) {
		return this;
	}
	
	public ContatoBase build() {
		return contato;
	}

}
