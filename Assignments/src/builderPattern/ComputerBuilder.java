package builderPattern;

// Abstract Builder
public abstract class ComputerBuilder {
	private NewComputer newComputer;
	
	public NewComputer getNewComputer() {
		return newComputer;
	}
	
	public void buildNewComputer() {
		newComputer = new NewComputer();
	}
	
	public abstract void setComputerName();
	
	public void buildProcessor() {
		newComputer.setProcessor(new Processor());
	}
	
	public void buildRAM() {
		newComputer.setRam(new RAM());
	}
	
	public void buildStorage() {
		newComputer.setStorage(new Storage());
	}
	
	public void buildGraphicsCard() {
		newComputer.setGraphicsCard(new GraphicsCard());
	}
	
	public void buildOperatingSystem() {
		newComputer.setOperatingSystem(new OperatingSystem());
	}
}
