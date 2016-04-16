package builder.ex2;

public interface ContatoBuilder {
	
	ContatoBuilder nome(String nome);
	
	ContatoBuilder telefone(String telefone);
	
	ContatoBuilder email(String email);
	
	ContatoBuilder endereco(String endereco);
	
	Contato build();

}
