package builderPattern;

// Concrete Part
public class HardDrive extends Storage {
	public HardDrive() {
		this.setPartName("Hard Drive");
		this.setPartSpecs("1256 Gigabytes of storage");
	}
}
