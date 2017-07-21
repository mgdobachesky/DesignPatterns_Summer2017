package exercise1_5;

public class Car implements Vehicle {

	public void drive()
	{
		System.out.println("drive in land");
	}
	
	public static void main(String[] args) {
		Car camry = new Car();
		camry.drive();
	}
	
}

