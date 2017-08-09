package exercise4_2;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance; // #1. Added
	private ChocolateBoiler() { // #2. Modified: Constructor now private
		empty = true;
		boiled = false;
	}
	public static ChocolateBoiler getInstance() { // #3. Added
		if(uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
	public boolean isEmpty() {
		return empty;
	}
	public boolean isBoiled() {
		return boiled;
	}
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			// drain the boiled mile and chocolate
			empty = true;
		}
	}
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
		}
	}
}
