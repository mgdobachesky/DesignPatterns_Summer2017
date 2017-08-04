package builderPattern;

// Concrete Builder
public class HpEnvy34CurvedBuilder extends ComputerBuilder {
	public void setComputerName() {
		this.getNewComputer().setComputerName("HP Envy 34 Curved All-in-One");
	}
	
	@Override
	public void buildProcessor() {
		this.getNewComputer().setProcessor(new IntelCoreI7());
	}
	
	@Override
	public void buildRAM() {
		this.getNewComputer().setRam(new SixteenGbDDR4());
	}
	
	@Override
	public void buildStorage() {
		this.getNewComputer().setStorage(new HardDrive());
	}
	
	@Override
	public void buildGraphicsCard() {
		this.getNewComputer().setGraphicsCard(new AmdRadeonRX());
	}
}
