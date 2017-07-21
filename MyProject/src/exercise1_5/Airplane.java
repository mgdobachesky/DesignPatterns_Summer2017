package exercise1_5;

public class Airplane implements Vehicle {
	
	public void drive()
	{
		System.out.println("drive in air");
	}

	public static void main(String[] args) {
		Airplane dc10 = new Airplane();
		dc10.drive();

	}

}
