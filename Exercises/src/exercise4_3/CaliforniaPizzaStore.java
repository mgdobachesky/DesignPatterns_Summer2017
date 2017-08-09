package exercise4_3;

public class CaliforniaPizzaStore extends PizzaStore {
	// We've got to implement createPizza method, since
		// it is abstract in the parent PizzaStore. Here's 
		// where we create out concrete classes.
		protected Pizza createPizza(String item) {
			if(item.equalsIgnoreCase("cheese")) {
				return new CaliforniaStyleCheesePizza();
			} else if(item.equalsIgnoreCase("veggie")) {
				return new CaliforniaStyleVeggiePizza();
			} else if(item.equalsIgnoreCase("clam")) {
				return new CaliforniaStyleClamPizza();
			} else return null;
		}
}
