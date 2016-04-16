package bridge.ex1;

public class Main {
	
	public static void main(String[] args) {
		TamanhoPequeno tamanhoPequeno = new TamanhoPequeno(new CocaCola());
		tamanhoPequeno.beber();
		
		TamanhoMedio tamanhoMedio = new TamanhoMedio(new Sprite());
		tamanhoMedio.beber();
		
		TamanhoGrande tamanhoGrande = new TamanhoGrande(new Fanta());
		tamanhoGrande.beber();
		
		TamanhoFamilia tamanhoFamilia = new TamanhoFamilia(new Schweppes());
		tamanhoFamilia.beber();
	}

}
