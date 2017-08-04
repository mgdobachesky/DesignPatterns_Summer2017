package builderPattern;

// Product
public class NewComputer {
	private String computerName;
	private Processor processor;
	private RAM ram;
	private Storage storage;
	private GraphicsCard graphicsCard;
	private OperatingSystem operatingSystem;
	
	public String getComputerName() {
		return computerName;
	}
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	public Processor getProcessor() {
		return processor;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	public RAM getRam() {
		return ram;
	}
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	public Storage getStorage() {
		return storage;
	}
	public void setStorage(Storage storage) {
		this.storage = storage;
	}
	public GraphicsCard getGraphicsCard() {
		return graphicsCard;
	}
	public void setGraphicsCard(GraphicsCard graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
	public OperatingSystem getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(OperatingSystem operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	public String getComputerSpecs() {
		StringBuffer specsBuffer = new StringBuffer();
		specsBuffer.append(" ~ " + this.getComputerName() + " ~ ");
		specsBuffer.append("\nProcessor: " + this.getProcessor().getPartName());
		specsBuffer.append("\nRAM: " + this.getRam().getPartName());
		specsBuffer.append("\nStorage: " + this.getStorage().getPartName());
		specsBuffer.append("\nGraphics Card: " + this.getGraphicsCard().getPartName());
		specsBuffer.append("\nOperating System: " + this.getOperatingSystem().getPartName());
		return specsBuffer.toString();
	}
}
