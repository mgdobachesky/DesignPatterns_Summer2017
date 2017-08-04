package exercise2_2;

public class WizardDuck extends Duck {
	public WizardDuck() {
		quackBehavior = new SignLanguage();
		flyBehavior = new FlyTeleport();
	}
	
	public void display() {
		System.out.println("look's like a wizard duck");
	}
}
