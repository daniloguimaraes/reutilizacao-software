package builder.ex2;

public class Client {
	
	public static void main(String[] args) {
		Director dir = new Director(null);
		
		ContatoTelefone contatoTelefone = dir.criarContatoTelefone();
		System.out.println(contatoTelefone);
		
		ContatoInternet contatoInternet = dir.criarContatoInternet();
		System.out.println(contatoInternet);
		
		ContatoCompleto contatoCompleto = dir.criarContatoCompleto();
		System.out.println(contatoCompleto);
		
	}

}
