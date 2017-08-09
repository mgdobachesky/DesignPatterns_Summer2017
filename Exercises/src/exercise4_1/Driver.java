package exercise4_1;

public class Driver {

	public static void main(String[] args) {
		ClassA.aStaticMethod();
		
		ClassA objClassA = new ClassA();
		objClassA.aNonStaticMethod();
		objClassA.aStaticMethod();
	}

}
