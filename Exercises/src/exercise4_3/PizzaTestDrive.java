package exercise4_3;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// Create two different stores
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoStore();
		PizzaStore caliStore = new CaliforniaPizzaStore();
		
		// Then use one store to make one customer order
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("First customer ordered a " + pizza.getName() + "\n");
		
		// Then use another store to make the second customer's order
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Second customer ordered a " + pizza.getName() + "\n");
		
		// Cali pizza
		pizza = caliStore.orderPizza("cheese");
		System.out.println("Third customer ordered a " + pizza.getName() + "\n");
	}

}
