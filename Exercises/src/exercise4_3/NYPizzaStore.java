package exercise4_3;

public class NYPizzaStore extends PizzaStore {
	// We've got to implement createPizza method, since
	// it is abstract in the parent PizzaStore. Here's 
	// where we create out concrete classes.
	protected Pizza createPizza(String item) {
		if(item.equalsIgnoreCase("cheese")) {
			return new NYStyleCheesePizza();
		} else if(item.equalsIgnoreCase("veggie")) {
			return new NYStyleVeggiePizza();
		} else if(item.equalsIgnoreCase("clam")) {
			return new NYStyleClamPizza();
		} else if(item.equalsIgnoreCase("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
