package singleton.ex1;

class Incremental {
	private static int count = 0;
	private int numero;

	private static Incremental incremental;

	public static Incremental getInstance() {

		if (incremental == null) {
			incremental = new Incremental();
		}

		return incremental;

	}

	public int Incrementa() {

		return numero = ++count;

	}

	public String toString() {
		return "Incremental " + numero;
	}
}

public class TesteIncremental {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int numero = Incremental.getInstance().Incrementa();
			System.out.println(numero);
		}
	}
}