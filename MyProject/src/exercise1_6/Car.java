package exercise1_6;

public class Car extends Vehicle {

	public void drive()
	{
		System.out.println("drive in road");
	}
	
	public static void main(String[] args) {
		Car camry = new Car();
		camry.drive();
		camry.lightsOn();
	}
	
}
