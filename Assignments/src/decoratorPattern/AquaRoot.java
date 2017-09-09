package decoratorPattern;

public class AquaRoot extends RootWord {

	public AquaRoot() {
		setDefinition("water");
	}
	
	@Override
	public String wordInfo() {
		return "aqua";
	}
	
}
