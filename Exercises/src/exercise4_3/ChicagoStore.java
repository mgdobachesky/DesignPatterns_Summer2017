package exercise4_3;

public class ChicagoStore extends PizzaStore {
	// We've got to implement createPizza method, since
	// it is abstract in the parent PizzaStore. Here's 
	// where we create out concrete classes.
	protected Pizza createPizza(String item) {
		if(item.equalsIgnoreCase("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if(item.equalsIgnoreCase("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if(item.equalsIgnoreCase("clam")) {
			return new ChicagoStyleClamPizza();
		} else if(item.equalsIgnoreCase("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else return null;
	}
}
