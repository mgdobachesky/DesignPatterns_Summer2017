package builderPattern;

// Abstract Part
public abstract class Part {
	private String partName;
	private String partSpecs;
	
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getPartSpecs() {
		return partSpecs;
	}
	public void setPartSpecs(String partSpecs) {
		this.partSpecs = partSpecs;
	}
	
	
}
