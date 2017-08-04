package builderPattern;

// Client and Director

public class Director {
	
	// The Client
	public static void main(String[] args) {
		NewComputer dellOptiPlex7450 = newComputer(new DellOptiPlex7450Builder());
		System.out.println(dellOptiPlex7450.getComputerSpecs());
		
		System.out.println();
		
		NewComputer hpEnvy32Curved = newComputer(new HpEnvy34CurvedBuilder());
		System.out.println(hpEnvy32Curved.getComputerSpecs());
	}
	
	// The Director
	public static NewComputer newComputer(ComputerBuilder computerBuilder) {
		computerBuilder.buildNewComputer();
		computerBuilder.setComputerName();
		
		computerBuilder.buildProcessor();
		computerBuilder.buildRAM();
		computerBuilder.buildStorage();
		computerBuilder.buildGraphicsCard();
		computerBuilder.buildOperatingSystem();
		
		return computerBuilder.getNewComputer();
	}
}
