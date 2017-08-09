package singletonPattern;

public class Driver {

	public static void main(String[] args) {
		Highlander highlander = Highlander.getInstance();
		highlander.shout();
		
		Highlander highlander2 = Highlander.getInstance();
		highlander2.shout();
	}

}
