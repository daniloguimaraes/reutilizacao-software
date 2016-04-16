package abstractFactory.ex1;

import java.util.Random;

/**
 * Fábrica de impressão.
 * 
 * @author Danilo Guimarães
 *
 */
public final class PrinterFactory {
	
	private static final Random RANDOM = new Random();
	
	/**
	 * Apenas imprime uma mensagem...
	 * 
	 * @param message a mensagem que será impressa.
	 */
	public static void justPrint(String message) {
		if (RANDOM.nextBoolean()) {
			new ConsolePrinter().printMessage(message);
		} else {
			new FilePrinter().printMessage(message);
		}
	}

}
