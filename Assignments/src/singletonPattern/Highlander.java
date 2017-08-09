package singletonPattern;

public class Highlander {
	private static Highlander uniqueInstance;
	private Highlander() {}
	public static Highlander getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Highlander();
		}
		return uniqueInstance;
	}
	public void shout() {
		System.out.println("There can only be one!!! ID = " + uniqueInstance.toString());
	}
}
