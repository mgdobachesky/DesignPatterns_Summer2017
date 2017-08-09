package exercise4_3;

public abstract class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		// The subclasses of PizzaStore handle object
		// instantiation for us in the createPizza() method
		pizza = createPizza(type); // no more 'new'
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	// Tadam! here's our Factory Method
	// All responsibility for instantiating Pizza has been
	// moved into a method that acts as a factory
	protected abstract Pizza createPizza(String type);
}
