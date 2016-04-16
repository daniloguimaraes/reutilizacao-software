package builder.ex1;

public class Main {
	
	public static void main(String[] args) {
		LancheInfantil lancheDoJuquinha = new LancheInfantilBuilder()
				.sanduiche(Sanduiche.HAMBURGER)
				.batata(Batata.GRANDE)
				.brinquedo(Brinquedo.CARRINHO)
				.refri(Refri.COCA)
				.build();
		
		System.out.println("O lanche do Juquinha é : " + lancheDoJuquinha);
		
		LancheInfantil lancheDaMariazinha = new LancheInfantilBuilder()
				.sanduiche(Sanduiche.HAMBURGER)
				.batata(Batata.PEQUENA)
				.brinquedo(Brinquedo.BONECA)
				.refri(Refri.GUARANA)
				.build();
		
		System.out.println("O lanche da Mariazinha é : " + lancheDaMariazinha);
	}

}
