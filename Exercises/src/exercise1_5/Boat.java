package exercise1_5;

public class Boat implements Vehicle {

	public void drive()
	{
		System.out.println("drive in water");
	}
	
	public static void main(String[] args) {
		Boat loveboat = new Boat();
		loveboat.drive();
	}

}

