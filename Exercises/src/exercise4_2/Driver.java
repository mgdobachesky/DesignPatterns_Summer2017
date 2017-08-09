package exercise4_2;

public class Driver {

	public static void main(String[] args) {
		
		//CocolateBoiler cb = new ChocolateBoiler()
		// OOPS error! Why?
		
		ChocolateBoiler cb = ChocolateBoiler.getInstance();
		// no more 'new' keyword
		
		cb.fill();
		cb.drain();
		System.out.println("cb object memory address = " + cb.toString());
		
		ChocolateBoiler cb2 = ChocolateBoiler.getInstance();
		System.out.println("cb2 object memory address = " + cb2.toString());
		
		ChocolateBoiler cb3 = ChocolateBoiler.getInstance();
		System.out.println("cb3 object memory address = " + cb3.toString());
	}

}
