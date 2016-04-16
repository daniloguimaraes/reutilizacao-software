package abstractFactory.ex2;

import java.util.Calendar;

/**
 * 
 * @author Danilo Guimarães
 *
 */
public final class PizzaFactory2 {

	public static String getIngredientesPizza(Calendar date) {
		
		int dia = date.get(Calendar.DAY_OF_WEEK);
		
		switch(dia) {
			case 1:
				return "Pizzaria encontra-se fechada. Volte na segunda-feira";
			case 2:
			case 4:
			case 6:
				return new PizzaFactory().prepararPizzaCalabresa().getIngredientes();
			case 3:
			case 5:
			case 7:
				return new PizzaFactory().prepararPizzaPresunto().getIngredientes();
			default: 
				return null;
		}
		
		
	}
	
	

}
