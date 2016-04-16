package adapter.ex1;

public class ArrayMapAdapter /*implements Map<String, String>*/ {

	String[][] array;
	
	public ArrayMapAdapter(String[][] mapa) throws IllegalArgumentException {
		if (mapa == null) {
			throw new IllegalArgumentException("O mapa nao pode ser nulo");
		}
		
		for (int i = 0; i <mapa.length; i++) {
			
		}
		
		
		this.array = mapa;
	}

}
