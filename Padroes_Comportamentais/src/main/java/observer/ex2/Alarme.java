package observer.ex2;

import java.util.ArrayList;

public class Alarme {

	ArrayList<Sensores> listasensores = new ArrayList<Sensores>();

	public Alarme() {
		for (int i = 0; i < 10; i++) {
			Sensores sensores = new Sensores();
			sensores.setDetecado(false);
			sensores.setId(i);
			listasensores.add(sensores);

		}
	}

}
