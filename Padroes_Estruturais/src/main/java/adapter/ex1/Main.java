package adapter.ex1;

import java.util.Observer;

public class Main {
	
	private static final int TAMANHO_ARRAY = 10;
	
	public static void main(String[] args) {
		String[][] mapa = null;
		
//		mapa = new String[TAMANHO_ARRAY][2];		
//		for (int i = 0; i < TAMANHO_ARRAY; i++) {
//			mapa[i][0] = "chave"+i;
//			mapa[i][1] = "valor"+i;
//		}
		
		new ArrayMapAdapter(mapa);
	}

}
