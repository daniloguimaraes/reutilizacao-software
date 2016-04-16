package abstractFactory.ex1;

/**
 * Classe que executa o exercício 1 do pattern Abstract Factory. 
 * 
 * @author Danilo Guimarães
 *
 */
public class Main {
	
	private static final int QUANTIDADE_IMPRESSAO = 10;

	public static void main(String[] args) {
		
		for (int i = 0; i < QUANTIDADE_IMPRESSAO; i++) {
			PrinterFactory.justPrint("Mensagem numero "+i);	
		}
		
		
	}

}
