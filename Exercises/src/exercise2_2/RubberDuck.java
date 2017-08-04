package exercise2_2;

public class RubberDuck extends Duck {
	public RubberDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("looks like a rubber duck");
	}
}
