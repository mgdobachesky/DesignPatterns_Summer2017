package exercise2_2;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("look's like a redhead");
	}
}
