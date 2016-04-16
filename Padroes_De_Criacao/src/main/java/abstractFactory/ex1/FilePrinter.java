package abstractFactory.ex1;

public class FilePrinter implements Printer {
	
	private static final String NOME_ARQUIVO = "output.txt";

	public void printMessage(String message) {
		System.out.println("imprimindo de mentirinha no arquivo " + NOME_ARQUIVO + ": " +  message);

	}

}
