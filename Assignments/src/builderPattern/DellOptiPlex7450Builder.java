package builderPattern;

// Concrete Builder
public class DellOptiPlex7450Builder extends ComputerBuilder {
	public void setComputerName() {
		this.getNewComputer().setComputerName("Dell OptiPlex 7450 All-in-One");
	}
	
	@Override
	public void buildProcessor() {
		this.getNewComputer().setProcessor(new IntelCoreI5());
	}
	
	@Override
	public void buildRAM() {
		this.getNewComputer().setRam(new SixteenGbDDR4());
	}
	
	@Override
	public void buildStorage() {
		this.getNewComputer().setStorage(new SSD());
	}
	
	@Override
	public void buildGraphicsCard() {
		this.getNewComputer().setGraphicsCard(new AmdRadeonR7());
	}
	
	@Override
	public void buildOperatingSystem() {
		this.getNewComputer().setOperatingSystem(new Windows10Pro());
	}
}
