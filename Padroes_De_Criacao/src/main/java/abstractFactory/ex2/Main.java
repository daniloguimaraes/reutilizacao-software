package abstractFactory.ex2;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();
		
		Calendar ontem = Calendar.getInstance();
		ontem.add(Calendar.DAY_OF_MONTH, -1);
		
		System.out.println("Os ingredientes de hoje sao: " + PizzaFactory2.getIngredientesPizza(hoje));
		
		System.out.println("Os ingredientes de ontem foram: " + PizzaFactory2.getIngredientesPizza(ontem));
	}
}
